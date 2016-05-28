/**
 */
package org.ckr.tabletUIDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Symbol</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ckr.tabletUIDSL.Symbol#getDevice <em>Device</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.Symbol#getGet <em>Get</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.Symbol#getGetOn <em>Get On</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.Symbol#getGetWarn <em>Get Warn</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.Symbol#getGetOff <em>Get Off</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.Symbol#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.Symbol#getBgicon <em>Bgicon</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.Symbol#getOffColor <em>Off Color</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.Symbol#getIcons <em>Icons</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.Symbol#getOnColors <em>On Colors</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.Symbol#getOnBackgroundColors <em>On Background Colors</em>}</li>
 * </ul>
 *
 * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getSymbol()
 * @model
 * @generated
 */
public interface Symbol extends Widget
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
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getSymbol_Device()
   * @model
   * @generated
   */
  String getDevice();

  /**
   * Sets the value of the '{@link org.ckr.tabletUIDSL.Symbol#getDevice <em>Device</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Device</em>' attribute.
   * @see #getDevice()
   * @generated
   */
  void setDevice(String value);

  /**
   * Returns the value of the '<em><b>Get</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Get</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Get</em>' attribute.
   * @see #setGet(String)
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getSymbol_Get()
   * @model
   * @generated
   */
  String getGet();

  /**
   * Sets the value of the '{@link org.ckr.tabletUIDSL.Symbol#getGet <em>Get</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Get</em>' attribute.
   * @see #getGet()
   * @generated
   */
  void setGet(String value);

  /**
   * Returns the value of the '<em><b>Get On</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Get On</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Get On</em>' attribute list.
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getSymbol_GetOn()
   * @model unique="false"
   * @generated
   */
  EList<String> getGetOn();

  /**
   * Returns the value of the '<em><b>Get Warn</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Get Warn</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Get Warn</em>' attribute.
   * @see #setGetWarn(String)
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getSymbol_GetWarn()
   * @model
   * @generated
   */
  String getGetWarn();

  /**
   * Sets the value of the '{@link org.ckr.tabletUIDSL.Symbol#getGetWarn <em>Get Warn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Get Warn</em>' attribute.
   * @see #getGetWarn()
   * @generated
   */
  void setGetWarn(String value);

  /**
   * Returns the value of the '<em><b>Get Off</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Get Off</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Get Off</em>' attribute list.
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getSymbol_GetOff()
   * @model unique="false"
   * @generated
   */
  EList<String> getGetOff();

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
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getSymbol_Class()
   * @model
   * @generated
   */
  String getClass_();

  /**
   * Sets the value of the '{@link org.ckr.tabletUIDSL.Symbol#getClass_ <em>Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Class</em>' attribute.
   * @see #getClass_()
   * @generated
   */
  void setClass(String value);

  /**
   * Returns the value of the '<em><b>Bgicon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Bgicon</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bgicon</em>' attribute.
   * @see #setBgicon(String)
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getSymbol_Bgicon()
   * @model
   * @generated
   */
  String getBgicon();

  /**
   * Sets the value of the '{@link org.ckr.tabletUIDSL.Symbol#getBgicon <em>Bgicon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bgicon</em>' attribute.
   * @see #getBgicon()
   * @generated
   */
  void setBgicon(String value);

  /**
   * Returns the value of the '<em><b>Off Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Off Color</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Off Color</em>' reference.
   * @see #setOffColor(Color)
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getSymbol_OffColor()
   * @model
   * @generated
   */
  Color getOffColor();

  /**
   * Sets the value of the '{@link org.ckr.tabletUIDSL.Symbol#getOffColor <em>Off Color</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Off Color</em>' reference.
   * @see #getOffColor()
   * @generated
   */
  void setOffColor(Color value);

  /**
   * Returns the value of the '<em><b>Icons</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Icons</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Icons</em>' attribute list.
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getSymbol_Icons()
   * @model unique="false"
   * @generated
   */
  EList<String> getIcons();

  /**
   * Returns the value of the '<em><b>On Colors</b></em>' reference list.
   * The list contents are of type {@link org.ckr.tabletUIDSL.Color}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>On Colors</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>On Colors</em>' reference list.
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getSymbol_OnColors()
   * @model
   * @generated
   */
  EList<Color> getOnColors();

  /**
   * Returns the value of the '<em><b>On Background Colors</b></em>' reference list.
   * The list contents are of type {@link org.ckr.tabletUIDSL.Color}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>On Background Colors</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>On Background Colors</em>' reference list.
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getSymbol_OnBackgroundColors()
   * @model
   * @generated
   */
  EList<Color> getOnBackgroundColors();

} // Symbol
