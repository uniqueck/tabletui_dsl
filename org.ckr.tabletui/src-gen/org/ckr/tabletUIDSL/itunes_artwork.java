/**
 */
package org.ckr.tabletUIDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>itunes artwork</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ckr.tabletUIDSL.itunes_artwork#getDevice <em>Device</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.itunes_artwork#getGet <em>Get</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.itunes_artwork#getOpacity <em>Opacity</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.itunes_artwork#getSize <em>Size</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.itunes_artwork#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.itunes_artwork#getStyle <em>Style</em>}</li>
 * </ul>
 *
 * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getitunes_artwork()
 * @model
 * @generated
 */
public interface itunes_artwork extends Widget
{
  /**
   * Returns the value of the '<em><b>Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Device</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Device</em>' attribute.
   * @see #setDevice(String)
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getitunes_artwork_Device()
   * @model
   * @generated
   */
  String getDevice();

  /**
   * Sets the value of the '{@link org.ckr.tabletUIDSL.itunes_artwork#getDevice <em>Device</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Device</em>' attribute.
   * @see #getDevice()
   * @generated
   */
  void setDevice(String value);

  /**
   * Returns the value of the '<em><b>Get</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Get</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Get</em>' attribute list.
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getitunes_artwork_Get()
   * @model unique="false"
   * @generated
   */
  EList<String> getGet();

  /**
   * Returns the value of the '<em><b>Opacity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Opacity</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Opacity</em>' attribute.
   * @see #setOpacity(String)
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getitunes_artwork_Opacity()
   * @model
   * @generated
   */
  String getOpacity();

  /**
   * Sets the value of the '{@link org.ckr.tabletUIDSL.itunes_artwork#getOpacity <em>Opacity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Opacity</em>' attribute.
   * @see #getOpacity()
   * @generated
   */
  void setOpacity(String value);

  /**
   * Returns the value of the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Size</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Size</em>' attribute.
   * @see #setSize(String)
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getitunes_artwork_Size()
   * @model
   * @generated
   */
  String getSize();

  /**
   * Sets the value of the '{@link org.ckr.tabletUIDSL.itunes_artwork#getSize <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' attribute.
   * @see #getSize()
   * @generated
   */
  void setSize(String value);

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
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getitunes_artwork_Class()
   * @model
   * @generated
   */
  String getClass_();

  /**
   * Sets the value of the '{@link org.ckr.tabletUIDSL.itunes_artwork#getClass_ <em>Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' attribute.
   * @see #getClass_()
   * @generated
   */
  void setClass(String value);

  /**
   * Returns the value of the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Style</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Style</em>' attribute.
   * @see #setStyle(String)
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getitunes_artwork_Style()
   * @model
   * @generated
   */
  String getStyle();

  /**
   * Sets the value of the '{@link org.ckr.tabletUIDSL.itunes_artwork#getStyle <em>Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Style</em>' attribute.
   * @see #getStyle()
   * @generated
   */
  void setStyle(String value);

} // itunes_artwork
