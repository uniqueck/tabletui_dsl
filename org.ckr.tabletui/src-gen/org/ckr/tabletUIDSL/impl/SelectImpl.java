/**
 */
package org.ckr.tabletUIDSL.impl;

import org.ckr.tabletUIDSL.Select;
import org.ckr.tabletUIDSL.TabletUIDSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Select</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SelectImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SelectImpl#getList <em>List</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SelectImpl#getItems <em>Items</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SelectImpl#getAlias <em>Alias</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SelectImpl#getCmd <em>Cmd</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SelectImpl#getQuote <em>Quote</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SelectImpl#getGet <em>Get</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SelectImpl#getSet <em>Set</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SelectImpl#getClass_ <em>Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SelectImpl extends WidgetImpl implements Select
{
  /**
   * The default value of the '{@link #getDevice() <em>Device</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDevice()
   * @generated
   * @ordered
   */
  protected static final String DEVICE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDevice() <em>Device</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDevice()
   * @generated
   * @ordered
   */
  protected String device = DEVICE_EDEFAULT;

  /**
   * The default value of the '{@link #getList() <em>List</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getList()
   * @generated
   * @ordered
   */
  protected static final String LIST_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getList() <em>List</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getList()
   * @generated
   * @ordered
   */
  protected String list = LIST_EDEFAULT;

  /**
   * The default value of the '{@link #getItems() <em>Items</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItems()
   * @generated
   * @ordered
   */
  protected static final String ITEMS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getItems() <em>Items</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getItems()
   * @generated
   * @ordered
   */
  protected String items = ITEMS_EDEFAULT;

  /**
   * The default value of the '{@link #getAlias() <em>Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlias()
   * @generated
   * @ordered
   */
  protected static final String ALIAS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAlias() <em>Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAlias()
   * @generated
   * @ordered
   */
  protected String alias = ALIAS_EDEFAULT;

  /**
   * The default value of the '{@link #getCmd() <em>Cmd</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCmd()
   * @generated
   * @ordered
   */
  protected static final String CMD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCmd() <em>Cmd</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCmd()
   * @generated
   * @ordered
   */
  protected String cmd = CMD_EDEFAULT;

  /**
   * The default value of the '{@link #getQuote() <em>Quote</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuote()
   * @generated
   * @ordered
   */
  protected static final String QUOTE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getQuote() <em>Quote</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQuote()
   * @generated
   * @ordered
   */
  protected String quote = QUOTE_EDEFAULT;

  /**
   * The default value of the '{@link #getGet() <em>Get</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGet()
   * @generated
   * @ordered
   */
  protected static final String GET_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGet() <em>Get</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGet()
   * @generated
   * @ordered
   */
  protected String get = GET_EDEFAULT;

  /**
   * The default value of the '{@link #getSet() <em>Set</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSet()
   * @generated
   * @ordered
   */
  protected static final String SET_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSet() <em>Set</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSet()
   * @generated
   * @ordered
   */
  protected String set = SET_EDEFAULT;

  /**
   * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected static final String CLASS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getClass_()
   * @generated
   * @ordered
   */
  protected String class_ = CLASS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SelectImpl()
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
    return TabletUIDSLPackage.Literals.SELECT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDevice()
  {
    return device;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDevice(String newDevice)
  {
    String oldDevice = device;
    device = newDevice;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SELECT__DEVICE, oldDevice, device));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getList()
  {
    return list;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setList(String newList)
  {
    String oldList = list;
    list = newList;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SELECT__LIST, oldList, list));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getItems()
  {
    return items;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setItems(String newItems)
  {
    String oldItems = items;
    items = newItems;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SELECT__ITEMS, oldItems, items));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAlias()
  {
    return alias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAlias(String newAlias)
  {
    String oldAlias = alias;
    alias = newAlias;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SELECT__ALIAS, oldAlias, alias));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCmd()
  {
    return cmd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCmd(String newCmd)
  {
    String oldCmd = cmd;
    cmd = newCmd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SELECT__CMD, oldCmd, cmd));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getQuote()
  {
    return quote;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setQuote(String newQuote)
  {
    String oldQuote = quote;
    quote = newQuote;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SELECT__QUOTE, oldQuote, quote));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGet()
  {
    return get;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGet(String newGet)
  {
    String oldGet = get;
    get = newGet;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SELECT__GET, oldGet, get));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSet()
  {
    return set;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSet(String newSet)
  {
    String oldSet = set;
    set = newSet;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SELECT__SET, oldSet, set));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getClass_()
  {
    return class_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setClass(String newClass)
  {
    String oldClass = class_;
    class_ = newClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SELECT__CLASS, oldClass, class_));
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
      case TabletUIDSLPackage.SELECT__DEVICE:
        return getDevice();
      case TabletUIDSLPackage.SELECT__LIST:
        return getList();
      case TabletUIDSLPackage.SELECT__ITEMS:
        return getItems();
      case TabletUIDSLPackage.SELECT__ALIAS:
        return getAlias();
      case TabletUIDSLPackage.SELECT__CMD:
        return getCmd();
      case TabletUIDSLPackage.SELECT__QUOTE:
        return getQuote();
      case TabletUIDSLPackage.SELECT__GET:
        return getGet();
      case TabletUIDSLPackage.SELECT__SET:
        return getSet();
      case TabletUIDSLPackage.SELECT__CLASS:
        return getClass_();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case TabletUIDSLPackage.SELECT__DEVICE:
        setDevice((String)newValue);
        return;
      case TabletUIDSLPackage.SELECT__LIST:
        setList((String)newValue);
        return;
      case TabletUIDSLPackage.SELECT__ITEMS:
        setItems((String)newValue);
        return;
      case TabletUIDSLPackage.SELECT__ALIAS:
        setAlias((String)newValue);
        return;
      case TabletUIDSLPackage.SELECT__CMD:
        setCmd((String)newValue);
        return;
      case TabletUIDSLPackage.SELECT__QUOTE:
        setQuote((String)newValue);
        return;
      case TabletUIDSLPackage.SELECT__GET:
        setGet((String)newValue);
        return;
      case TabletUIDSLPackage.SELECT__SET:
        setSet((String)newValue);
        return;
      case TabletUIDSLPackage.SELECT__CLASS:
        setClass((String)newValue);
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
      case TabletUIDSLPackage.SELECT__DEVICE:
        setDevice(DEVICE_EDEFAULT);
        return;
      case TabletUIDSLPackage.SELECT__LIST:
        setList(LIST_EDEFAULT);
        return;
      case TabletUIDSLPackage.SELECT__ITEMS:
        setItems(ITEMS_EDEFAULT);
        return;
      case TabletUIDSLPackage.SELECT__ALIAS:
        setAlias(ALIAS_EDEFAULT);
        return;
      case TabletUIDSLPackage.SELECT__CMD:
        setCmd(CMD_EDEFAULT);
        return;
      case TabletUIDSLPackage.SELECT__QUOTE:
        setQuote(QUOTE_EDEFAULT);
        return;
      case TabletUIDSLPackage.SELECT__GET:
        setGet(GET_EDEFAULT);
        return;
      case TabletUIDSLPackage.SELECT__SET:
        setSet(SET_EDEFAULT);
        return;
      case TabletUIDSLPackage.SELECT__CLASS:
        setClass(CLASS_EDEFAULT);
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
      case TabletUIDSLPackage.SELECT__DEVICE:
        return DEVICE_EDEFAULT == null ? device != null : !DEVICE_EDEFAULT.equals(device);
      case TabletUIDSLPackage.SELECT__LIST:
        return LIST_EDEFAULT == null ? list != null : !LIST_EDEFAULT.equals(list);
      case TabletUIDSLPackage.SELECT__ITEMS:
        return ITEMS_EDEFAULT == null ? items != null : !ITEMS_EDEFAULT.equals(items);
      case TabletUIDSLPackage.SELECT__ALIAS:
        return ALIAS_EDEFAULT == null ? alias != null : !ALIAS_EDEFAULT.equals(alias);
      case TabletUIDSLPackage.SELECT__CMD:
        return CMD_EDEFAULT == null ? cmd != null : !CMD_EDEFAULT.equals(cmd);
      case TabletUIDSLPackage.SELECT__QUOTE:
        return QUOTE_EDEFAULT == null ? quote != null : !QUOTE_EDEFAULT.equals(quote);
      case TabletUIDSLPackage.SELECT__GET:
        return GET_EDEFAULT == null ? get != null : !GET_EDEFAULT.equals(get);
      case TabletUIDSLPackage.SELECT__SET:
        return SET_EDEFAULT == null ? set != null : !SET_EDEFAULT.equals(set);
      case TabletUIDSLPackage.SELECT__CLASS:
        return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
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
    result.append(" (device: ");
    result.append(device);
    result.append(", list: ");
    result.append(list);
    result.append(", items: ");
    result.append(items);
    result.append(", alias: ");
    result.append(alias);
    result.append(", cmd: ");
    result.append(cmd);
    result.append(", quote: ");
    result.append(quote);
    result.append(", get: ");
    result.append(get);
    result.append(", set: ");
    result.append(set);
    result.append(", class: ");
    result.append(class_);
    result.append(')');
    return result.toString();
  }

} //SelectImpl
