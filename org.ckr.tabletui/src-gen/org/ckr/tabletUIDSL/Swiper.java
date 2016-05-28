/**
 */
package org.ckr.tabletUIDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Swiper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ckr.tabletUIDSL.Swiper#getWidth <em>Width</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.Swiper#getHeight <em>Height</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.Swiper#getAutoplay <em>Autoplay</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.Swiper#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.Swiper#getDivs <em>Divs</em>}</li>
 * </ul>
 *
 * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getSwiper()
 * @model
 * @generated
 */
public interface Swiper extends Widget
{
  /**
   * Returns the value of the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Width</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Width</em>' attribute.
   * @see #setWidth(String)
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getSwiper_Width()
   * @model
   * @generated
   */
  String getWidth();

  /**
   * Sets the value of the '{@link org.ckr.tabletUIDSL.Swiper#getWidth <em>Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Width</em>' attribute.
   * @see #getWidth()
   * @generated
   */
  void setWidth(String value);

  /**
   * Returns the value of the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Height</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Height</em>' attribute.
   * @see #setHeight(String)
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getSwiper_Height()
   * @model
   * @generated
   */
  String getHeight();

  /**
   * Sets the value of the '{@link org.ckr.tabletUIDSL.Swiper#getHeight <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Height</em>' attribute.
   * @see #getHeight()
   * @generated
   */
  void setHeight(String value);

  /**
   * Returns the value of the '<em><b>Autoplay</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Autoplay</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Autoplay</em>' attribute.
   * @see #setAutoplay(int)
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getSwiper_Autoplay()
   * @model
   * @generated
   */
  int getAutoplay();

  /**
   * Sets the value of the '{@link org.ckr.tabletUIDSL.Swiper#getAutoplay <em>Autoplay</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Autoplay</em>' attribute.
   * @see #getAutoplay()
   * @generated
   */
  void setAutoplay(int value);

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
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getSwiper_Class()
   * @model
   * @generated
   */
  String getClass_();

  /**
   * Sets the value of the '{@link org.ckr.tabletUIDSL.Swiper#getClass_ <em>Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' attribute.
   * @see #getClass_()
   * @generated
   */
  void setClass(String value);

  /**
   * Returns the value of the '<em><b>Divs</b></em>' containment reference list.
   * The list contents are of type {@link org.ckr.tabletUIDSL.Div}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Divs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Divs</em>' containment reference list.
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getSwiper_Divs()
   * @model containment="true"
   * @generated
   */
  EList<Div> getDivs();

} // Swiper
