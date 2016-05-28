/**
 */
package org.ckr.tabletUIDSL.impl;

import java.util.Collection;

import org.ckr.tabletUIDSL.Div;
import org.ckr.tabletUIDSL.TabletUIDSLPackage;
import org.ckr.tabletUIDSL.Template;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ckr.tabletUIDSL.impl.TemplateImpl#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TemplateImpl extends AbstractElementImpl implements Template
{
  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected EList<Div> elements;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TemplateImpl()
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
    return TabletUIDSLPackage.Literals.TEMPLATE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Div> getElements()
  {
    if (elements == null)
    {
      elements = new EObjectContainmentEList<Div>(Div.class, this, TabletUIDSLPackage.TEMPLATE__ELEMENTS);
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
      case TabletUIDSLPackage.TEMPLATE__ELEMENTS:
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
      case TabletUIDSLPackage.TEMPLATE__ELEMENTS:
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
      case TabletUIDSLPackage.TEMPLATE__ELEMENTS:
        getElements().clear();
        getElements().addAll((Collection<? extends Div>)newValue);
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
      case TabletUIDSLPackage.TEMPLATE__ELEMENTS:
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
      case TabletUIDSLPackage.TEMPLATE__ELEMENTS:
        return elements != null && !elements.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //TemplateImpl
