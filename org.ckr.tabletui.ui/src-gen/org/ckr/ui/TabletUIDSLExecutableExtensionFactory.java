/*
 * generated by Xtext
 */
package org.ckr.ui;

import org.eclipse.xtext.ui.guice.AbstractGuiceAwareExecutableExtensionFactory;
import org.osgi.framework.Bundle;

import com.google.inject.Injector;

import org.ckr.ui.internal.TabletUIDSLActivator;

/**
 * This class was generated. Customizations should only happen in a newly
 * introduced subclass. 
 */
public class TabletUIDSLExecutableExtensionFactory extends AbstractGuiceAwareExecutableExtensionFactory {

	@Override
	protected Bundle getBundle() {
		return TabletUIDSLActivator.getInstance().getBundle();
	}
	
	@Override
	protected Injector getInjector() {
		return TabletUIDSLActivator.getInstance().getInjector(TabletUIDSLActivator.ORG_CKR_TABLETUIDSL);
	}
	
}
