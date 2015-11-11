/**
 */
package org.ckr.tabletUIDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ckr.tabletUIDSL.Button#getId <em>Id</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.Button#getUrl <em>Url</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.Button#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.Button#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.Button#getColor <em>Color</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.Button#getBackgroundColor <em>Background Color</em>}</li>
 * </ul>
 *
 * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getButton()
 * @model
 * @generated
 */
public interface Button extends Widget
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' attribute.
   * @see #setId(String)
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getButton_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.ckr.tabletUIDSL.Button#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Url</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Url</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Url</em>' reference.
   * @see #setUrl(Page)
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getButton_Url()
   * @model
   * @generated
   */
  Page getUrl();

  /**
   * Sets the value of the '{@link org.ckr.tabletUIDSL.Button#getUrl <em>Url</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url</em>' reference.
   * @see #getUrl()
   * @generated
   */
  void setUrl(Page value);

  /**
   * Returns the value of the '<em><b>Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Icon</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Icon</em>' attribute.
   * @see #setIcon(String)
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getButton_Icon()
   * @model
   * @generated
   */
  String getIcon();

  /**
   * Sets the value of the '{@link org.ckr.tabletUIDSL.Button#getIcon <em>Icon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Icon</em>' attribute.
   * @see #getIcon()
   * @generated
   */
  void setIcon(String value);

  /**
   * Returns the value of the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Class</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Class</em>' attribute.
   * @see #setClass(String)
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getButton_Class()
   * @model
   * @generated
   */
  String getClass_();

  /**
   * Sets the value of the '{@link org.ckr.tabletUIDSL.Button#getClass_ <em>Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' attribute.
   * @see #getClass_()
   * @generated
   */
  void setClass(String value);

  /**
   * Returns the value of the '<em><b>Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Color</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Color</em>' reference.
   * @see #setColor(Color)
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getButton_Color()
   * @model
   * @generated
   */
  Color getColor();

  /**
   * Sets the value of the '{@link org.ckr.tabletUIDSL.Button#getColor <em>Color</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Color</em>' reference.
   * @see #getColor()
   * @generated
   */
  void setColor(Color value);

  /**
   * Returns the value of the '<em><b>Background Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Background Color</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Background Color</em>' reference.
   * @see #setBackgroundColor(Color)
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getButton_BackgroundColor()
   * @model
   * @generated
   */
  Color getBackgroundColor();

  /**
   * Sets the value of the '{@link org.ckr.tabletUIDSL.Button#getBackgroundColor <em>Background Color</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Background Color</em>' reference.
   * @see #getBackgroundColor()
   * @generated
   */
  void setBackgroundColor(Color value);

} // Button
