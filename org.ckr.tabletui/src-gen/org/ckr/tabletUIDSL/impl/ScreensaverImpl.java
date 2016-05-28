/**
 */
package org.ckr.tabletUIDSL.impl;

import java.util.Collection;

import org.ckr.tabletUIDSL.Screensaver;
import org.ckr.tabletUIDSL.TabletUIDSLPackage;
import org.ckr.tabletUIDSL.WidgetDef;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Screensaver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ckr.tabletUIDSL.impl.ScreensaverImpl#getWidgets <em>Widgets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ScreensaverImpl extends AbstractElementImpl implements Screensaver
{
  /**
   * The cached value of the '{@link #getWidgets() <em>Widgets</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidgets()
   * @generated
   * @ordered
   */
  protected EList<WidgetDef> widgets;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ScreensaverImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TabletUIDSLPackage.Literals.SCREENSAVER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<WidgetDef> getWidgets()
  {
    if (widgets == null)
    {
      widgets = new EObjectContainmentEList<WidgetDef>(WidgetDef.class, this, TabletUIDSLPackage.SCREENSAVER__WIDGETS);
    }
    return widgets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TabletUIDSLPackage.SCREENSAVER__WIDGETS:
        return ((InternalEList<?>)getWidgets()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TabletUIDSLPackage.SCREENSAVER__WIDGETS:
        return getWidgets();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TabletUIDSLPackage.SCREENSAVER__WIDGETS:
        getWidgets().clear();
        getWidgets().addAll((Collection<? extends WidgetDef>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TabletUIDSLPackage.SCREENSAVER__WIDGETS:
        getWidgets().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TabletUIDSLPackage.SCREENSAVER__WIDGETS:
        return widgets != null && !widgets.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //ScreensaverImpl
