package com.stack;

import com.psl.contact.Contact;
import com.psl.contact.exception.InvalidInformationException;
import com.stack.exception.StackEmptyException;
import com.stack.exception.StackOverflowException;


public class Stack {

    static final int MAX = 100;
    private int top;
    private Contact data[] = new Contact[MAX];

    Stack(){
        top = -1;
    }

    public boolean isEmpty() {
        return (top < 0);
    }
    private boolean isFull() {
        return top >= (MAX - 1);
    }


    public void push(Contact contact) throws InvalidInformationException, StackOverflowException {

        contact.validate();
        if (isFull()) {
            throw new StackOverflowException();
        }
        else {
            data[++top] = contact;

        }
    }
    public Contact pop() throws StackEmptyException {

        if(isEmpty())
            throw  new StackEmptyException();

        return data[top--];
    }


    public Contact peak() throws StackEmptyException {

        if(isEmpty())
            throw  new StackEmptyException();

        return data[top];
    }
}
