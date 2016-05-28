/**
 */
package org.ckr.tabletUIDSL.impl;

import java.util.Collection;

import org.ckr.tabletUIDSL.Gridster;
import org.ckr.tabletUIDSL.Page;
import org.ckr.tabletUIDSL.Screensaver;
import org.ckr.tabletUIDSL.TabletUIDSLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ckr.tabletUIDSL.impl.PageImpl#getScreensaver <em>Screensaver</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.PageImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PageImpl extends AbstractElementImpl implements Page
{
  /**
   * The cached value of the '{@link #getScreensaver() <em>Screensaver</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getScreensaver()
   * @generated
   * @ordered
   */
  protected Screensaver screensaver;

  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<Gridster> elements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PageImpl()
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
    return TabletUIDSLPackage.Literals.PAGE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Screensaver getScreensaver()
  {
    if (screensaver != null && screensaver.eIsProxy())
    {
      InternalEObject oldScreensaver = (InternalEObject)screensaver;
      screensaver = (Screensaver)eResolveProxy(oldScreensaver);
      if (screensaver != oldScreensaver)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TabletUIDSLPackage.PAGE__SCREENSAVER, oldScreensaver, screensaver));
      }
    }
    return screensaver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Screensaver basicGetScreensaver()
  {
    return screensaver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setScreensaver(Screensaver newScreensaver)
  {
    Screensaver oldScreensaver = screensaver;
    screensaver = newScreensaver;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.PAGE__SCREENSAVER, oldScreensaver, screensaver));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Gridster> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<Gridster>(Gridster.class, this, TabletUIDSLPackage.PAGE__ELEMENTS);
    }
    return elements;
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
      case TabletUIDSLPackage.PAGE__ELEMENTS:
        return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
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
      case TabletUIDSLPackage.PAGE__SCREENSAVER:
        if (resolve) return getScreensaver();
        return basicGetScreensaver();
      case TabletUIDSLPackage.PAGE__ELEMENTS:
        return getElements();
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
      case TabletUIDSLPackage.PAGE__SCREENSAVER:
        setScreensaver((Screensaver)newValue);
        return;
      case TabletUIDSLPackage.PAGE__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends Gridster>)newValue);
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
      case TabletUIDSLPackage.PAGE__SCREENSAVER:
        setScreensaver((Screensaver)null);
        return;
      case TabletUIDSLPackage.PAGE__ELEMENTS:
        getElements().clear();
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
      case TabletUIDSLPackage.PAGE__SCREENSAVER:
        return screensaver != null;
      case TabletUIDSLPackage.PAGE__ELEMENTS:
        return elements != null && !elements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //PageImpl
