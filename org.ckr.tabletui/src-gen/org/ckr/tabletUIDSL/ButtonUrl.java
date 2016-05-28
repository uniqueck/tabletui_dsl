/**
 */
package org.ckr.tabletUIDSL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button Url</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ckr.tabletUIDSL.ButtonUrl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.ButtonUrl#getPage <em>Page</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.ButtonUrl#getFhemCmd <em>Fhem Cmd</em>}</li>
 * </ul>
 *
 * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getButtonUrl()
 * @model
 * @generated
 */
public interface ButtonUrl extends EObject
{
  /**
   * Returns the value of the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Url</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Url</em>' attribute.
   * @see #setUrl(String)
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getButtonUrl_Url()
   * @model
   * @generated
   */
  String getUrl();

  /**
   * Sets the value of the '{@link org.ckr.tabletUIDSL.ButtonUrl#getUrl <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url</em>' attribute.
   * @see #getUrl()
   * @generated
   */
  void setUrl(String value);

  /**
   * Returns the value of the '<em><b>Page</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Page</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Page</em>' reference.
   * @see #setPage(Page)
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getButtonUrl_Page()
   * @model
   * @generated
   */
  Page getPage();

  /**
   * Sets the value of the '{@link org.ckr.tabletUIDSL.ButtonUrl#getPage <em>Page</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Page</em>' reference.
   * @see #getPage()
   * @generated
   */
  void setPage(Page value);

  /**
   * Returns the value of the '<em><b>Fhem Cmd</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fhem Cmd</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fhem Cmd</em>' attribute.
   * @see #setFhemCmd(String)
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getButtonUrl_FhemCmd()
   * @model
   * @generated
   */
  String getFhemCmd();

  /**
   * Sets the value of the '{@link org.ckr.tabletUIDSL.ButtonUrl#getFhemCmd <em>Fhem Cmd</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fhem Cmd</em>' attribute.
   * @see #getFhemCmd()
   * @generated
   */
  void setFhemCmd(String value);

} // ButtonUrl
