/**
 */
package org.ckr.tabletUIDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Clock</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ckr.tabletUIDSL.SimpleClock#getId <em>Id</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.SimpleClock#getDateFormat <em>Date Format</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.SimpleClock#getTimeFormat <em>Time Format</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.SimpleClock#getDateColor <em>Date Color</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.SimpleClock#getTimeColor <em>Time Color</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.SimpleClock#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.SimpleClock#getStyle <em>Style</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.SimpleClock#getBgColors <em>Bg Colors</em>}</li>
 * </ul>
 *
 * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getSimpleClock()
 * @model
 * @generated
 */
public interface SimpleClock extends Widget
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
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getSimpleClock_Id()
   * @model
   * @generated
   */
  String getId();

  /**
   * Sets the value of the '{@link org.ckr.tabletUIDSL.SimpleClock#getId <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' attribute.
   * @see #getId()
   * @generated
   */
  void setId(String value);

  /**
   * Returns the value of the '<em><b>Date Format</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Date Format</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Date Format</em>' attribute.
   * @see #setDateFormat(String)
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getSimpleClock_DateFormat()
   * @model
   * @generated
   */
  String getDateFormat();

  /**
   * Sets the value of the '{@link org.ckr.tabletUIDSL.SimpleClock#getDateFormat <em>Date Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Date Format</em>' attribute.
   * @see #getDateFormat()
   * @generated
   */
  void setDateFormat(String value);

  /**
   * Returns the value of the '<em><b>Time Format</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Time Format</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time Format</em>' attribute.
   * @see #setTimeFormat(String)
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getSimpleClock_TimeFormat()
   * @model
   * @generated
   */
  String getTimeFormat();

  /**
   * Sets the value of the '{@link org.ckr.tabletUIDSL.SimpleClock#getTimeFormat <em>Time Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time Format</em>' attribute.
   * @see #getTimeFormat()
   * @generated
   */
  void setTimeFormat(String value);

  /**
   * Returns the value of the '<em><b>Date Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Date Color</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Date Color</em>' reference.
   * @see #setDateColor(Color)
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getSimpleClock_DateColor()
   * @model
   * @generated
   */
  Color getDateColor();

  /**
   * Sets the value of the '{@link org.ckr.tabletUIDSL.SimpleClock#getDateColor <em>Date Color</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Date Color</em>' reference.
   * @see #getDateColor()
   * @generated
   */
  void setDateColor(Color value);

  /**
   * Returns the value of the '<em><b>Time Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Time Color</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Time Color</em>' reference.
   * @see #setTimeColor(Color)
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getSimpleClock_TimeColor()
   * @model
   * @generated
   */
  Color getTimeColor();

  /**
   * Sets the value of the '{@link org.ckr.tabletUIDSL.SimpleClock#getTimeColor <em>Time Color</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Time Color</em>' reference.
   * @see #getTimeColor()
   * @generated
   */
  void setTimeColor(Color value);

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
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getSimpleClock_Class()
   * @model
   * @generated
   */
  String getClass_();

  /**
   * Sets the value of the '{@link org.ckr.tabletUIDSL.SimpleClock#getClass_ <em>Class</em>}' attribute.
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
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getSimpleClock_Style()
   * @model
   * @generated
   */
  String getStyle();

  /**
   * Sets the value of the '{@link org.ckr.tabletUIDSL.SimpleClock#getStyle <em>Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Style</em>' attribute.
   * @see #getStyle()
   * @generated
   */
  void setStyle(String value);

  /**
   * Returns the value of the '<em><b>Bg Colors</b></em>' reference list.
   * The list contents are of type {@link org.ckr.tabletUIDSL.Color}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bg Colors</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bg Colors</em>' reference list.
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getSimpleClock_BgColors()
   * @model
   * @generated
   */
  EList<Color> getBgColors();

} // SimpleClock
