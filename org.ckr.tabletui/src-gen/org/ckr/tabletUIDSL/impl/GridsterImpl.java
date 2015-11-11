/**
 */
package org.ckr.tabletUIDSL.impl;

import java.util.Collection;

import org.ckr.tabletUIDSL.Color;
import org.ckr.tabletUIDSL.Gridster;
import org.ckr.tabletUIDSL.TabletUIDSLPackage;
import org.ckr.tabletUIDSL.Widget;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gridster</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ckr.tabletUIDSL.impl.GridsterImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.GridsterImpl#getRow <em>Row</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.GridsterImpl#getColumn <em>Column</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.GridsterImpl#getColspan <em>Colspan</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.GridsterImpl#getRowspan <em>Rowspan</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.GridsterImpl#getColors <em>Colors</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.GridsterImpl#getWidgets <em>Widgets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GridsterImpl extends MinimalEObjectImpl.Container implements Gridster
{
  /**
   * The default value of the '{@link #getHeader() <em>Header</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeader()
   * @generated
   * @ordered
   */
  protected static final String HEADER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHeader() <em>Header</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeader()
   * @generated
   * @ordered
   */
  protected String header = HEADER_EDEFAULT;

  /**
   * The default value of the '{@link #getRow() <em>Row</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRow()
   * @generated
   * @ordered
   */
  protected static final int ROW_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getRow() <em>Row</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRow()
   * @generated
   * @ordered
   */
  protected int row = ROW_EDEFAULT;

  /**
   * The default value of the '{@link #getColumn() <em>Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumn()
   * @generated
   * @ordered
   */
  protected static final int COLUMN_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getColumn() <em>Column</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumn()
   * @generated
   * @ordered
   */
  protected int column = COLUMN_EDEFAULT;

  /**
   * The default value of the '{@link #getColspan() <em>Colspan</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColspan()
   * @generated
   * @ordered
   */
  protected static final int COLSPAN_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getColspan() <em>Colspan</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColspan()
   * @generated
   * @ordered
   */
  protected int colspan = COLSPAN_EDEFAULT;

  /**
   * The default value of the '{@link #getRowspan() <em>Rowspan</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRowspan()
   * @generated
   * @ordered
   */
  protected static final int ROWSPAN_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getRowspan() <em>Rowspan</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRowspan()
   * @generated
   * @ordered
   */
  protected int rowspan = ROWSPAN_EDEFAULT;

  /**
   * The cached value of the '{@link #getColors() <em>Colors</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColors()
   * @generated
   * @ordered
   */
  protected EList<Color> colors;

  /**
   * The cached value of the '{@link #getWidgets() <em>Widgets</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidgets()
   * @generated
   * @ordered
   */
  protected EList<Widget> widgets;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GridsterImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return TabletUIDSLPackage.Literals.GRIDSTER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHeader()
  {
    return header;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeader(String newHeader)
  {
    String oldHeader = header;
    header = newHeader;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.GRIDSTER__HEADER, oldHeader, header));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getRow()
  {
    return row;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRow(int newRow)
  {
    int oldRow = row;
    row = newRow;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.GRIDSTER__ROW, oldRow, row));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getColumn()
  {
    return column;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColumn(int newColumn)
  {
    int oldColumn = column;
    column = newColumn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.GRIDSTER__COLUMN, oldColumn, column));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getColspan()
  {
    return colspan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColspan(int newColspan)
  {
    int oldColspan = colspan;
    colspan = newColspan;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.GRIDSTER__COLSPAN, oldColspan, colspan));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getRowspan()
  {
    return rowspan;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRowspan(int newRowspan)
  {
    int oldRowspan = rowspan;
    rowspan = newRowspan;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.GRIDSTER__ROWSPAN, oldRowspan, rowspan));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Color> getColors()
  {
    if (colors == null)
    {
      colors = new EObjectContainmentEList<Color>(Color.class, this, TabletUIDSLPackage.GRIDSTER__COLORS);
    }
    return colors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Widget> getWidgets()
  {
    if (widgets == null)
    {
      widgets = new EObjectContainmentEList<Widget>(Widget.class, this, TabletUIDSLPackage.GRIDSTER__WIDGETS);
    }
    return widgets;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case TabletUIDSLPackage.GRIDSTER__COLORS:
        return ((InternalEList<?>)getColors()).basicRemove(otherEnd, msgs);
      case TabletUIDSLPackage.GRIDSTER__WIDGETS:
        return ((InternalEList<?>)getWidgets()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case TabletUIDSLPackage.GRIDSTER__HEADER:
        return getHeader();
      case TabletUIDSLPackage.GRIDSTER__ROW:
        return getRow();
      case TabletUIDSLPackage.GRIDSTER__COLUMN:
        return getColumn();
      case TabletUIDSLPackage.GRIDSTER__COLSPAN:
        return getColspan();
      case TabletUIDSLPackage.GRIDSTER__ROWSPAN:
        return getRowspan();
      case TabletUIDSLPackage.GRIDSTER__COLORS:
        return getColors();
      case TabletUIDSLPackage.GRIDSTER__WIDGETS:
        return getWidgets();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TabletUIDSLPackage.GRIDSTER__HEADER:
        setHeader((String)newValue);
        return;
      case TabletUIDSLPackage.GRIDSTER__ROW:
        setRow((Integer)newValue);
        return;
      case TabletUIDSLPackage.GRIDSTER__COLUMN:
        setColumn((Integer)newValue);
        return;
      case TabletUIDSLPackage.GRIDSTER__COLSPAN:
        setColspan((Integer)newValue);
        return;
      case TabletUIDSLPackage.GRIDSTER__ROWSPAN:
        setRowspan((Integer)newValue);
        return;
      case TabletUIDSLPackage.GRIDSTER__COLORS:
        getColors().clear();
        getColors().addAll((Collection<? extends Color>)newValue);
        return;
      case TabletUIDSLPackage.GRIDSTER__WIDGETS:
        getWidgets().clear();
        getWidgets().addAll((Collection<? extends Widget>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case TabletUIDSLPackage.GRIDSTER__HEADER:
        setHeader(HEADER_EDEFAULT);
        return;
      case TabletUIDSLPackage.GRIDSTER__ROW:
        setRow(ROW_EDEFAULT);
        return;
      case TabletUIDSLPackage.GRIDSTER__COLUMN:
        setColumn(COLUMN_EDEFAULT);
        return;
      case TabletUIDSLPackage.GRIDSTER__COLSPAN:
        setColspan(COLSPAN_EDEFAULT);
        return;
      case TabletUIDSLPackage.GRIDSTER__ROWSPAN:
        setRowspan(ROWSPAN_EDEFAULT);
        return;
      case TabletUIDSLPackage.GRIDSTER__COLORS:
        getColors().clear();
        return;
      case TabletUIDSLPackage.GRIDSTER__WIDGETS:
        getWidgets().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case TabletUIDSLPackage.GRIDSTER__HEADER:
        return HEADER_EDEFAULT == null ? header != null : !HEADER_EDEFAULT.equals(header);
      case TabletUIDSLPackage.GRIDSTER__ROW:
        return row != ROW_EDEFAULT;
      case TabletUIDSLPackage.GRIDSTER__COLUMN:
        return column != COLUMN_EDEFAULT;
      case TabletUIDSLPackage.GRIDSTER__COLSPAN:
        return colspan != COLSPAN_EDEFAULT;
      case TabletUIDSLPackage.GRIDSTER__ROWSPAN:
        return rowspan != ROWSPAN_EDEFAULT;
      case TabletUIDSLPackage.GRIDSTER__COLORS:
        return colors != null && !colors.isEmpty();
      case TabletUIDSLPackage.GRIDSTER__WIDGETS:
        return widgets != null && !widgets.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (header: ");
    result.append(header);
    result.append(", row: ");
    result.append(row);
    result.append(", column: ");
    result.append(column);
    result.append(", colspan: ");
    result.append(colspan);
    result.append(", rowspan: ");
    result.append(rowspan);
    result.append(')');
    return result.toString();
  }

} //GridsterImpl
