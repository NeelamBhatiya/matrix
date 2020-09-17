package com.stack;

import com.psl.contact.Contact;
import com.psl.contact.exception.InvalidInformationException;
import com.stack.exception.StackEmptyException;
import com.stack.exception.StackUninitializedException;

import java.util.LinkedList;
import java.util.List;


public class Stack {

    private List<Contact> list;

    public Stack() {
        this.list = new LinkedList<>();
    }
    public void push(Contact contact) throws StackUninitializedException, InvalidInformationException {
        if(this.list == null)
            throw new StackUninitializedException();
        contact.validate();
        this.list.add(contact);
    }
    public Contact pop() throws StackUninitializedException, StackEmptyException {
        if (this.list==null)
            throw new StackUninitializedException();

        if(this.list.isEmpty())
            throw new StackEmptyException();

        int lastIndex = this.list.size()-1;
        Contact contact = this.list.get(lastIndex);
        this.list.remove(lastIndex);

        return contact;
    }
    public long size() {
        return this.list.size();
    }


}
