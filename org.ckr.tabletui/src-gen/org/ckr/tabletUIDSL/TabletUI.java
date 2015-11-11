/**
 */
package org.ckr.tabletUIDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tablet UI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ckr.tabletUIDSL.TabletUI#getSettings <em>Settings</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.TabletUI#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getTabletUI()
 * @model
 * @generated
 */
public interface TabletUI extends EObject
{
  /**
   * Returns the value of the '<em><b>Settings</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Settings</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Settings</em>' containment reference.
   * @see #setSettings(Settings)
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getTabletUI_Settings()
   * @model containment="true"
   * @generated
   */
  Settings getSettings();

  /**
   * Sets the value of the '{@link org.ckr.tabletUIDSL.TabletUI#getSettings <em>Settings</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Settings</em>' containment reference.
   * @see #getSettings()
   * @generated
   */
  void setSettings(Settings value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.ckr.tabletUIDSL.AbstractElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getTabletUI_Elements()
   * @model containment="true"
   * @generated
   */
  EList<AbstractElement> getElements();

} // TabletUI
