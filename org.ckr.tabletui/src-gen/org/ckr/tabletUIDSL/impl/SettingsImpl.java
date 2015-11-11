/**
 */
package org.ckr.tabletUIDSL.impl;

import java.util.Collection;

import org.ckr.tabletUIDSL.Settings;
import org.ckr.tabletUIDSL.SettingsElement;
import org.ckr.tabletUIDSL.TabletUIDSLPackage;

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
 * An implementation of the model object '<em><b>Settings</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SettingsImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SettingsImpl#getFhemweb_url <em>Fhemweb url</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SettingsImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SettingsImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SettingsImpl#getColumns <em>Columns</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SettingsImpl#getRows <em>Rows</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SettingsImpl#getDebug <em>Debug</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SettingsImpl#getDragdrop <em>Dragdrop</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SettingsImpl#getMargin <em>Margin</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SettingsImpl#getSettings <em>Settings</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SettingsImpl extends MinimalEObjectImpl.Container implements Settings
{
  /**
   * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected static final String TITLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected String title = TITLE_EDEFAULT;

  /**
   * The default value of the '{@link #getFhemweb_url() <em>Fhemweb url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFhemweb_url()
   * @generated
   * @ordered
   */
  protected static final String FHEMWEB_URL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFhemweb_url() <em>Fhemweb url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFhemweb_url()
   * @generated
   * @ordered
   */
  protected String fhemweb_url = FHEMWEB_URL_EDEFAULT;

  /**
   * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidth()
   * @generated
   * @ordered
   */
  protected static final int WIDTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidth()
   * @generated
   * @ordered
   */
  protected int width = WIDTH_EDEFAULT;

  /**
   * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeight()
   * @generated
   * @ordered
   */
  protected static final int HEIGHT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeight()
   * @generated
   * @ordered
   */
  protected int height = HEIGHT_EDEFAULT;

  /**
   * The default value of the '{@link #getColumns() <em>Columns</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumns()
   * @generated
   * @ordered
   */
  protected static final int COLUMNS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getColumns() <em>Columns</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumns()
   * @generated
   * @ordered
   */
  protected int columns = COLUMNS_EDEFAULT;

  /**
   * The default value of the '{@link #getRows() <em>Rows</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRows()
   * @generated
   * @ordered
   */
  protected static final int ROWS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getRows() <em>Rows</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRows()
   * @generated
   * @ordered
   */
  protected int rows = ROWS_EDEFAULT;

  /**
   * The default value of the '{@link #getDebug() <em>Debug</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDebug()
   * @generated
   * @ordered
   */
  protected static final String DEBUG_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDebug() <em>Debug</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDebug()
   * @generated
   * @ordered
   */
  protected String debug = DEBUG_EDEFAULT;

  /**
   * The default value of the '{@link #getDragdrop() <em>Dragdrop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDragdrop()
   * @generated
   * @ordered
   */
  protected static final String DRAGDROP_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDragdrop() <em>Dragdrop</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDragdrop()
   * @generated
   * @ordered
   */
  protected String dragdrop = DRAGDROP_EDEFAULT;

  /**
   * The default value of the '{@link #getMargin() <em>Margin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMargin()
   * @generated
   * @ordered
   */
  protected static final int MARGIN_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMargin() <em>Margin</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMargin()
   * @generated
   * @ordered
   */
  protected int margin = MARGIN_EDEFAULT;

  /**
   * The cached value of the '{@link #getSettings() <em>Settings</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSettings()
   * @generated
   * @ordered
   */
  protected EList<SettingsElement> settings;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SettingsImpl()
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
    return TabletUIDSLPackage.Literals.SETTINGS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTitle(String newTitle)
  {
    String oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SETTINGS__TITLE, oldTitle, title));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFhemweb_url()
  {
    return fhemweb_url;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFhemweb_url(String newFhemweb_url)
  {
    String oldFhemweb_url = fhemweb_url;
    fhemweb_url = newFhemweb_url;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SETTINGS__FHEMWEB_URL, oldFhemweb_url, fhemweb_url));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getWidth()
  {
    return width;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWidth(int newWidth)
  {
    int oldWidth = width;
    width = newWidth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SETTINGS__WIDTH, oldWidth, width));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getHeight()
  {
    return height;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeight(int newHeight)
  {
    int oldHeight = height;
    height = newHeight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SETTINGS__HEIGHT, oldHeight, height));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getColumns()
  {
    return columns;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColumns(int newColumns)
  {
    int oldColumns = columns;
    columns = newColumns;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SETTINGS__COLUMNS, oldColumns, columns));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getRows()
  {
    return rows;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRows(int newRows)
  {
    int oldRows = rows;
    rows = newRows;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SETTINGS__ROWS, oldRows, rows));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDebug()
  {
    return debug;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDebug(String newDebug)
  {
    String oldDebug = debug;
    debug = newDebug;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SETTINGS__DEBUG, oldDebug, debug));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDragdrop()
  {
    return dragdrop;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDragdrop(String newDragdrop)
  {
    String oldDragdrop = dragdrop;
    dragdrop = newDragdrop;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SETTINGS__DRAGDROP, oldDragdrop, dragdrop));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMargin()
  {
    return margin;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMargin(int newMargin)
  {
    int oldMargin = margin;
    margin = newMargin;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SETTINGS__MARGIN, oldMargin, margin));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<SettingsElement> getSettings()
  {
    if (settings == null)
    {
      settings = new EObjectContainmentEList<SettingsElement>(SettingsElement.class, this, TabletUIDSLPackage.SETTINGS__SETTINGS);
    }
    return settings;
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
      case TabletUIDSLPackage.SETTINGS__SETTINGS:
        return ((InternalEList<?>)getSettings()).basicRemove(otherEnd, msgs);
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
      case TabletUIDSLPackage.SETTINGS__TITLE:
        return getTitle();
      case TabletUIDSLPackage.SETTINGS__FHEMWEB_URL:
        return getFhemweb_url();
      case TabletUIDSLPackage.SETTINGS__WIDTH:
        return getWidth();
      case TabletUIDSLPackage.SETTINGS__HEIGHT:
        return getHeight();
      case TabletUIDSLPackage.SETTINGS__COLUMNS:
        return getColumns();
      case TabletUIDSLPackage.SETTINGS__ROWS:
        return getRows();
      case TabletUIDSLPackage.SETTINGS__DEBUG:
        return getDebug();
      case TabletUIDSLPackage.SETTINGS__DRAGDROP:
        return getDragdrop();
      case TabletUIDSLPackage.SETTINGS__MARGIN:
        return getMargin();
      case TabletUIDSLPackage.SETTINGS__SETTINGS:
        return getSettings();
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
      case TabletUIDSLPackage.SETTINGS__TITLE:
        setTitle((String)newValue);
        return;
      case TabletUIDSLPackage.SETTINGS__FHEMWEB_URL:
        setFhemweb_url((String)newValue);
        return;
      case TabletUIDSLPackage.SETTINGS__WIDTH:
        setWidth((Integer)newValue);
        return;
      case TabletUIDSLPackage.SETTINGS__HEIGHT:
        setHeight((Integer)newValue);
        return;
      case TabletUIDSLPackage.SETTINGS__COLUMNS:
        setColumns((Integer)newValue);
        return;
      case TabletUIDSLPackage.SETTINGS__ROWS:
        setRows((Integer)newValue);
        return;
      case TabletUIDSLPackage.SETTINGS__DEBUG:
        setDebug((String)newValue);
        return;
      case TabletUIDSLPackage.SETTINGS__DRAGDROP:
        setDragdrop((String)newValue);
        return;
      case TabletUIDSLPackage.SETTINGS__MARGIN:
        setMargin((Integer)newValue);
        return;
      case TabletUIDSLPackage.SETTINGS__SETTINGS:
        getSettings().clear();
        getSettings().addAll((Collection<? extends SettingsElement>)newValue);
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
      case TabletUIDSLPackage.SETTINGS__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case TabletUIDSLPackage.SETTINGS__FHEMWEB_URL:
        setFhemweb_url(FHEMWEB_URL_EDEFAULT);
        return;
      case TabletUIDSLPackage.SETTINGS__WIDTH:
        setWidth(WIDTH_EDEFAULT);
        return;
      case TabletUIDSLPackage.SETTINGS__HEIGHT:
        setHeight(HEIGHT_EDEFAULT);
        return;
      case TabletUIDSLPackage.SETTINGS__COLUMNS:
        setColumns(COLUMNS_EDEFAULT);
        return;
      case TabletUIDSLPackage.SETTINGS__ROWS:
        setRows(ROWS_EDEFAULT);
        return;
      case TabletUIDSLPackage.SETTINGS__DEBUG:
        setDebug(DEBUG_EDEFAULT);
        return;
      case TabletUIDSLPackage.SETTINGS__DRAGDROP:
        setDragdrop(DRAGDROP_EDEFAULT);
        return;
      case TabletUIDSLPackage.SETTINGS__MARGIN:
        setMargin(MARGIN_EDEFAULT);
        return;
      case TabletUIDSLPackage.SETTINGS__SETTINGS:
        getSettings().clear();
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
      case TabletUIDSLPackage.SETTINGS__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case TabletUIDSLPackage.SETTINGS__FHEMWEB_URL:
        return FHEMWEB_URL_EDEFAULT == null ? fhemweb_url != null : !FHEMWEB_URL_EDEFAULT.equals(fhemweb_url);
      case TabletUIDSLPackage.SETTINGS__WIDTH:
        return width != WIDTH_EDEFAULT;
      case TabletUIDSLPackage.SETTINGS__HEIGHT:
        return height != HEIGHT_EDEFAULT;
      case TabletUIDSLPackage.SETTINGS__COLUMNS:
        return columns != COLUMNS_EDEFAULT;
      case TabletUIDSLPackage.SETTINGS__ROWS:
        return rows != ROWS_EDEFAULT;
      case TabletUIDSLPackage.SETTINGS__DEBUG:
        return DEBUG_EDEFAULT == null ? debug != null : !DEBUG_EDEFAULT.equals(debug);
      case TabletUIDSLPackage.SETTINGS__DRAGDROP:
        return DRAGDROP_EDEFAULT == null ? dragdrop != null : !DRAGDROP_EDEFAULT.equals(dragdrop);
      case TabletUIDSLPackage.SETTINGS__MARGIN:
        return margin != MARGIN_EDEFAULT;
      case TabletUIDSLPackage.SETTINGS__SETTINGS:
        return settings != null && !settings.isEmpty();
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
    result.append(" (title: ");
    result.append(title);
    result.append(", fhemweb_url: ");
    result.append(fhemweb_url);
    result.append(", width: ");
    result.append(width);
    result.append(", height: ");
    result.append(height);
    result.append(", columns: ");
    result.append(columns);
    result.append(", rows: ");
    result.append(rows);
    result.append(", debug: ");
    result.append(debug);
    result.append(", dragdrop: ");
    result.append(dragdrop);
    result.append(", margin: ");
    result.append(margin);
    result.append(')');
    return result.toString();
  }

} //SettingsImpl
