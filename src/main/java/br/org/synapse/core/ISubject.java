package br.org.synapse.core;

public interface ISubject {
    void addObserver(IObserver observer);
    
    void removeObserver(IObserver observer);
}
