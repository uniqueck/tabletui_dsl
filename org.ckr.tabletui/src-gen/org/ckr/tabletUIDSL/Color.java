/**
 */
package org.ckr.tabletUIDSL;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ckr.tabletUIDSL.Color#getName <em>Name</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.Color#getRgb <em>Rgb</em>}</li>
 * </ul>
 *
 * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getColor()
 * @model
 * @generated
 */
public interface Color extends SettingsElement
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getColor_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link org.ckr.tabletUIDSL.Color#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Rgb</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rgb</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rgb</em>' attribute.
   * @see #setRgb(String)
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getColor_Rgb()
   * @model
   * @generated
   */
  String getRgb();

  /**
   * Sets the value of the '{@link org.ckr.tabletUIDSL.Color#getRgb <em>Rgb</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rgb</em>' attribute.
   * @see #getRgb()
   * @generated
   */
  void setRgb(String value);

} // Color
