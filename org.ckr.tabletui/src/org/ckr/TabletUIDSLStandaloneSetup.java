/*
 * generated by Xtext
 */
package org.ckr;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class TabletUIDSLStandaloneSetup extends TabletUIDSLStandaloneSetupGenerated{

	public static void doSetup() {
		new TabletUIDSLStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

