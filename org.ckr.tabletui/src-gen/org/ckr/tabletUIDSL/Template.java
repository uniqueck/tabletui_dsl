/**
 */
package org.ckr.tabletUIDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ckr.tabletUIDSL.Template#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getTemplate()
 * @model
 * @generated
 */
public interface Template extends AbstractElement
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.ckr.tabletUIDSL.Div}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getTemplate_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Div> getElements();

} // Template
