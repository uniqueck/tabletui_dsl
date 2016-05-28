/**
 */
package org.ckr.tabletUIDSL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Template Ref</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ckr.tabletUIDSL.TemplateRef#getTemplate <em>Template</em>}</li>
 * </ul>
 *
 * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getTemplateRef()
 * @model
 * @generated
 */
public interface TemplateRef extends Widget
{
  /**
   * Returns the value of the '<em><b>Template</b></em>' containment reference list.
   * The list contents are of type {@link org.ckr.tabletUIDSL.Template}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Template</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Template</em>' containment reference list.
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getTemplateRef_Template()
   * @model containment="true"
   * @generated
   */
  EList<Template> getTemplate();

} // TemplateRef
