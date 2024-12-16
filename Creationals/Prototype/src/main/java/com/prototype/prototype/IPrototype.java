package com.prototype.prototype;

public interface IPrototype<T extends IPrototype> extends Cloneable {

    // Clonacion simple
    public T clone();

    // Clonacion profunda
    public T deepClone();

}
