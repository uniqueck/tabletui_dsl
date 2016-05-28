/**
 */
package org.ckr.tabletUIDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Screensaver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ckr.tabletUIDSL.Screensaver#getWidgets <em>Widgets</em>}</li>
 * </ul>
 *
 * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getScreensaver()
 * @model
 * @generated
 */
public interface Screensaver extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Widgets</b></em>' containment reference list.
   * The list contents are of type {@link org.ckr.tabletUIDSL.WidgetDef}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Widgets</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Widgets</em>' containment reference list.
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getScreensaver_Widgets()
   * @model containment="true"
   * @generated
   */
  EList<WidgetDef> getWidgets();

} // Screensaver
