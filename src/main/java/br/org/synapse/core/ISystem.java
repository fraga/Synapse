package br.org.synapse.core;

public interface ISystem {
	void initialize();
	int getPriority();
	ISystemScene createScene();
	void destroyScene(ISystemScene scene);
	void shutdown();
}
