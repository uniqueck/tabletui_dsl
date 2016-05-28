/**
 */
package org.ckr.tabletUIDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ckr.tabletUIDSL.Page#getScreensaver <em>Screensaver</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.Page#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getPage()
 * @model
 * @generated
 */
public interface Page extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Screensaver</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Screensaver</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Screensaver</em>' reference.
   * @see #setScreensaver(Screensaver)
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getPage_Screensaver()
   * @model
   * @generated
   */
  Screensaver getScreensaver();

  /**
   * Sets the value of the '{@link org.ckr.tabletUIDSL.Page#getScreensaver <em>Screensaver</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Screensaver</em>' reference.
   * @see #getScreensaver()
   * @generated
   */
  void setScreensaver(Screensaver value);

  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.ckr.tabletUIDSL.Gridster}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getPage_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Gridster> getElements();

} // Page
