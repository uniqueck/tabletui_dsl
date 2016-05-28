/**
 */
package org.ckr.tabletUIDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clock</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ckr.tabletUIDSL.Clock#getFormat <em>Format</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.Clock#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.Clock#getStyle <em>Style</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.Clock#getInterval <em>Interval</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.Clock#getDays <em>Days</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.Clock#getShortdayLength <em>Shortday Length</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.Clock#getMonth <em>Month</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.Clock#getMonthLength <em>Month Length</em>}</li>
 * </ul>
 *
 * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getClock()
 * @model
 * @generated
 */
public interface Clock extends Widget
{
  /**
   * Returns the value of the '<em><b>Format</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Format</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Format</em>' attribute.
   * @see #setFormat(String)
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getClock_Format()
   * @model
   * @generated
   */
  String getFormat();

  /**
   * Sets the value of the '{@link org.ckr.tabletUIDSL.Clock#getFormat <em>Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Format</em>' attribute.
   * @see #getFormat()
   * @generated
   */
  void setFormat(String value);

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
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getClock_Class()
   * @model
   * @generated
   */
  String getClass_();

  /**
   * Sets the value of the '{@link org.ckr.tabletUIDSL.Clock#getClass_ <em>Class</em>}' attribute.
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
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getClock_Style()
   * @model
   * @generated
   */
  String getStyle();

  /**
   * Sets the value of the '{@link org.ckr.tabletUIDSL.Clock#getStyle <em>Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Style</em>' attribute.
   * @see #getStyle()
   * @generated
   */
  void setStyle(String value);

  /**
   * Returns the value of the '<em><b>Interval</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Interval</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Interval</em>' attribute.
   * @see #setInterval(int)
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getClock_Interval()
   * @model
   * @generated
   */
  int getInterval();

  /**
   * Sets the value of the '{@link org.ckr.tabletUIDSL.Clock#getInterval <em>Interval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Interval</em>' attribute.
   * @see #getInterval()
   * @generated
   */
  void setInterval(int value);

  /**
   * Returns the value of the '<em><b>Days</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Days</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Days</em>' attribute list.
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getClock_Days()
   * @model unique="false"
   * @generated
   */
  EList<String> getDays();

  /**
   * Returns the value of the '<em><b>Shortday Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Shortday Length</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Shortday Length</em>' attribute.
   * @see #setShortdayLength(int)
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getClock_ShortdayLength()
   * @model
   * @generated
   */
  int getShortdayLength();

  /**
   * Sets the value of the '{@link org.ckr.tabletUIDSL.Clock#getShortdayLength <em>Shortday Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Shortday Length</em>' attribute.
   * @see #getShortdayLength()
   * @generated
   */
  void setShortdayLength(int value);

  /**
   * Returns the value of the '<em><b>Month</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Month</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Month</em>' attribute list.
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getClock_Month()
   * @model unique="false"
   * @generated
   */
  EList<String> getMonth();

  /**
   * Returns the value of the '<em><b>Month Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Month Length</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Month Length</em>' attribute.
   * @see #setMonthLength(int)
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getClock_MonthLength()
   * @model
   * @generated
   */
  int getMonthLength();

  /**
   * Sets the value of the '{@link org.ckr.tabletUIDSL.Clock#getMonthLength <em>Month Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Month Length</em>' attribute.
   * @see #getMonthLength()
   * @generated
   */
  void setMonthLength(int value);

} // Clock
