/**
 */
package org.ckr.tabletUIDSL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Gridster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.ckr.tabletUIDSL.Gridster#getHeader <em>Header</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.Gridster#getRow <em>Row</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.Gridster#getColumn <em>Column</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.Gridster#getColspan <em>Colspan</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.Gridster#getRowspan <em>Rowspan</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.Gridster#getColors <em>Colors</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.Gridster#getWidgets <em>Widgets</em>}</li>
 * </ul>
 *
 * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getGridster()
 * @model
 * @generated
 */
public interface Gridster extends EObject
{
  /**
   * Returns the value of the '<em><b>Header</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Header</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Header</em>' attribute.
   * @see #setHeader(String)
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getGridster_Header()
   * @model
   * @generated
   */
  String getHeader();

  /**
   * Sets the value of the '{@link org.ckr.tabletUIDSL.Gridster#getHeader <em>Header</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Header</em>' attribute.
   * @see #getHeader()
   * @generated
   */
  void setHeader(String value);

  /**
   * Returns the value of the '<em><b>Row</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Row</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Row</em>' attribute.
   * @see #setRow(int)
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getGridster_Row()
   * @model
   * @generated
   */
  int getRow();

  /**
   * Sets the value of the '{@link org.ckr.tabletUIDSL.Gridster#getRow <em>Row</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Row</em>' attribute.
   * @see #getRow()
   * @generated
   */
  void setRow(int value);

  /**
   * Returns the value of the '<em><b>Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Column</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Column</em>' attribute.
   * @see #setColumn(int)
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getGridster_Column()
   * @model
   * @generated
   */
  int getColumn();

  /**
   * Sets the value of the '{@link org.ckr.tabletUIDSL.Gridster#getColumn <em>Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Column</em>' attribute.
   * @see #getColumn()
   * @generated
   */
  void setColumn(int value);

  /**
   * Returns the value of the '<em><b>Colspan</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Colspan</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Colspan</em>' attribute.
   * @see #setColspan(int)
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getGridster_Colspan()
   * @model
   * @generated
   */
  int getColspan();

  /**
   * Sets the value of the '{@link org.ckr.tabletUIDSL.Gridster#getColspan <em>Colspan</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Colspan</em>' attribute.
   * @see #getColspan()
   * @generated
   */
  void setColspan(int value);

  /**
   * Returns the value of the '<em><b>Rowspan</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rowspan</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rowspan</em>' attribute.
   * @see #setRowspan(int)
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getGridster_Rowspan()
   * @model
   * @generated
   */
  int getRowspan();

  /**
   * Sets the value of the '{@link org.ckr.tabletUIDSL.Gridster#getRowspan <em>Rowspan</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rowspan</em>' attribute.
   * @see #getRowspan()
   * @generated
   */
  void setRowspan(int value);

  /**
   * Returns the value of the '<em><b>Colors</b></em>' containment reference list.
   * The list contents are of type {@link org.ckr.tabletUIDSL.Color}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Colors</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Colors</em>' containment reference list.
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getGridster_Colors()
   * @model containment="true"
   * @generated
   */
  EList<Color> getColors();

  /**
   * Returns the value of the '<em><b>Widgets</b></em>' containment reference list.
   * The list contents are of type {@link org.ckr.tabletUIDSL.Widget}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Widgets</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Widgets</em>' containment reference list.
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#getGridster_Widgets()
   * @model containment="true"
   * @generated
   */
  EList<Widget> getWidgets();

} // Gridster
