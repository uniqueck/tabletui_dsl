/**
 */
package org.ckr.tabletUIDSL.impl;

import org.ckr.tabletUIDSL.Push;
import org.ckr.tabletUIDSL.TabletUIDSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Push</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ckr.tabletUIDSL.impl.PushImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.PushImpl#getDataSet <em>Data Set</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.PushImpl#getSetOn <em>Set On</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.PushImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.PushImpl#getBackgroundIcon <em>Background Icon</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.PushImpl#getCmd <em>Cmd</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.PushImpl#getDoubleClick <em>Double Click</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.PushImpl#getCountdown <em>Countdown</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.PushImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.PushImpl#getUrl <em>Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PushImpl extends WidgetImpl implements Push
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
   * The default value of the '{@link #getDataSet() <em>Data Set</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataSet()
   * @generated
   * @ordered
   */
  protected static final String DATA_SET_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDataSet() <em>Data Set</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDataSet()
   * @generated
   * @ordered
   */
  protected String dataSet = DATA_SET_EDEFAULT;

  /**
   * The default value of the '{@link #getSetOn() <em>Set On</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSetOn()
   * @generated
   * @ordered
   */
  protected static final String SET_ON_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSetOn() <em>Set On</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSetOn()
   * @generated
   * @ordered
   */
  protected String setOn = SET_ON_EDEFAULT;

  /**
   * The default value of the '{@link #getIcon() <em>Icon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIcon()
   * @generated
   * @ordered
   */
  protected static final String ICON_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIcon() <em>Icon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIcon()
   * @generated
   * @ordered
   */
  protected String icon = ICON_EDEFAULT;

  /**
   * The default value of the '{@link #getBackgroundIcon() <em>Background Icon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBackgroundIcon()
   * @generated
   * @ordered
   */
  protected static final String BACKGROUND_ICON_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBackgroundIcon() <em>Background Icon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBackgroundIcon()
   * @generated
   * @ordered
   */
  protected String backgroundIcon = BACKGROUND_ICON_EDEFAULT;

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
   * The default value of the '{@link #getDoubleClick() <em>Double Click</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoubleClick()
   * @generated
   * @ordered
   */
  protected static final int DOUBLE_CLICK_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDoubleClick() <em>Double Click</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDoubleClick()
   * @generated
   * @ordered
   */
  protected int doubleClick = DOUBLE_CLICK_EDEFAULT;

  /**
   * The default value of the '{@link #getCountdown() <em>Countdown</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCountdown()
   * @generated
   * @ordered
   */
  protected static final String COUNTDOWN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getCountdown() <em>Countdown</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCountdown()
   * @generated
   * @ordered
   */
  protected String countdown = COUNTDOWN_EDEFAULT;

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
   * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
  protected static final String URL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
  protected String url = URL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PushImpl()
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
    return TabletUIDSLPackage.Literals.PUSH;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.PUSH__DEVICE, oldDevice, device));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDataSet()
  {
    return dataSet;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDataSet(String newDataSet)
  {
    String oldDataSet = dataSet;
    dataSet = newDataSet;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.PUSH__DATA_SET, oldDataSet, dataSet));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSetOn()
  {
    return setOn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSetOn(String newSetOn)
  {
    String oldSetOn = setOn;
    setOn = newSetOn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.PUSH__SET_ON, oldSetOn, setOn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getIcon()
  {
    return icon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setIcon(String newIcon)
  {
    String oldIcon = icon;
    icon = newIcon;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.PUSH__ICON, oldIcon, icon));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBackgroundIcon()
  {
    return backgroundIcon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBackgroundIcon(String newBackgroundIcon)
  {
    String oldBackgroundIcon = backgroundIcon;
    backgroundIcon = newBackgroundIcon;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.PUSH__BACKGROUND_ICON, oldBackgroundIcon, backgroundIcon));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.PUSH__CMD, oldCmd, cmd));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDoubleClick()
  {
    return doubleClick;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDoubleClick(int newDoubleClick)
  {
    int oldDoubleClick = doubleClick;
    doubleClick = newDoubleClick;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.PUSH__DOUBLE_CLICK, oldDoubleClick, doubleClick));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getCountdown()
  {
    return countdown;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setCountdown(String newCountdown)
  {
    String oldCountdown = countdown;
    countdown = newCountdown;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.PUSH__COUNTDOWN, oldCountdown, countdown));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.PUSH__CLASS, oldClass, class_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUrl()
  {
    return url;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUrl(String newUrl)
  {
    String oldUrl = url;
    url = newUrl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.PUSH__URL, oldUrl, url));
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
      case TabletUIDSLPackage.PUSH__DEVICE:
        return getDevice();
      case TabletUIDSLPackage.PUSH__DATA_SET:
        return getDataSet();
      case TabletUIDSLPackage.PUSH__SET_ON:
        return getSetOn();
      case TabletUIDSLPackage.PUSH__ICON:
        return getIcon();
      case TabletUIDSLPackage.PUSH__BACKGROUND_ICON:
        return getBackgroundIcon();
      case TabletUIDSLPackage.PUSH__CMD:
        return getCmd();
      case TabletUIDSLPackage.PUSH__DOUBLE_CLICK:
        return getDoubleClick();
      case TabletUIDSLPackage.PUSH__COUNTDOWN:
        return getCountdown();
      case TabletUIDSLPackage.PUSH__CLASS:
        return getClass_();
      case TabletUIDSLPackage.PUSH__URL:
        return getUrl();
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
      case TabletUIDSLPackage.PUSH__DEVICE:
        setDevice((String)newValue);
        return;
      case TabletUIDSLPackage.PUSH__DATA_SET:
        setDataSet((String)newValue);
        return;
      case TabletUIDSLPackage.PUSH__SET_ON:
        setSetOn((String)newValue);
        return;
      case TabletUIDSLPackage.PUSH__ICON:
        setIcon((String)newValue);
        return;
      case TabletUIDSLPackage.PUSH__BACKGROUND_ICON:
        setBackgroundIcon((String)newValue);
        return;
      case TabletUIDSLPackage.PUSH__CMD:
        setCmd((String)newValue);
        return;
      case TabletUIDSLPackage.PUSH__DOUBLE_CLICK:
        setDoubleClick((Integer)newValue);
        return;
      case TabletUIDSLPackage.PUSH__COUNTDOWN:
        setCountdown((String)newValue);
        return;
      case TabletUIDSLPackage.PUSH__CLASS:
        setClass((String)newValue);
        return;
      case TabletUIDSLPackage.PUSH__URL:
        setUrl((String)newValue);
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
      case TabletUIDSLPackage.PUSH__DEVICE:
        setDevice(DEVICE_EDEFAULT);
        return;
      case TabletUIDSLPackage.PUSH__DATA_SET:
        setDataSet(DATA_SET_EDEFAULT);
        return;
      case TabletUIDSLPackage.PUSH__SET_ON:
        setSetOn(SET_ON_EDEFAULT);
        return;
      case TabletUIDSLPackage.PUSH__ICON:
        setIcon(ICON_EDEFAULT);
        return;
      case TabletUIDSLPackage.PUSH__BACKGROUND_ICON:
        setBackgroundIcon(BACKGROUND_ICON_EDEFAULT);
        return;
      case TabletUIDSLPackage.PUSH__CMD:
        setCmd(CMD_EDEFAULT);
        return;
      case TabletUIDSLPackage.PUSH__DOUBLE_CLICK:
        setDoubleClick(DOUBLE_CLICK_EDEFAULT);
        return;
      case TabletUIDSLPackage.PUSH__COUNTDOWN:
        setCountdown(COUNTDOWN_EDEFAULT);
        return;
      case TabletUIDSLPackage.PUSH__CLASS:
        setClass(CLASS_EDEFAULT);
        return;
      case TabletUIDSLPackage.PUSH__URL:
        setUrl(URL_EDEFAULT);
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
      case TabletUIDSLPackage.PUSH__DEVICE:
        return DEVICE_EDEFAULT == null ? device != null : !DEVICE_EDEFAULT.equals(device);
      case TabletUIDSLPackage.PUSH__DATA_SET:
        return DATA_SET_EDEFAULT == null ? dataSet != null : !DATA_SET_EDEFAULT.equals(dataSet);
      case TabletUIDSLPackage.PUSH__SET_ON:
        return SET_ON_EDEFAULT == null ? setOn != null : !SET_ON_EDEFAULT.equals(setOn);
      case TabletUIDSLPackage.PUSH__ICON:
        return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
      case TabletUIDSLPackage.PUSH__BACKGROUND_ICON:
        return BACKGROUND_ICON_EDEFAULT == null ? backgroundIcon != null : !BACKGROUND_ICON_EDEFAULT.equals(backgroundIcon);
      case TabletUIDSLPackage.PUSH__CMD:
        return CMD_EDEFAULT == null ? cmd != null : !CMD_EDEFAULT.equals(cmd);
      case TabletUIDSLPackage.PUSH__DOUBLE_CLICK:
        return doubleClick != DOUBLE_CLICK_EDEFAULT;
      case TabletUIDSLPackage.PUSH__COUNTDOWN:
        return COUNTDOWN_EDEFAULT == null ? countdown != null : !COUNTDOWN_EDEFAULT.equals(countdown);
      case TabletUIDSLPackage.PUSH__CLASS:
        return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
      case TabletUIDSLPackage.PUSH__URL:
        return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
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
    result.append(", dataSet: ");
    result.append(dataSet);
    result.append(", setOn: ");
    result.append(setOn);
    result.append(", icon: ");
    result.append(icon);
    result.append(", backgroundIcon: ");
    result.append(backgroundIcon);
    result.append(", cmd: ");
    result.append(cmd);
    result.append(", doubleClick: ");
    result.append(doubleClick);
    result.append(", countdown: ");
    result.append(countdown);
    result.append(", class: ");
    result.append(class_);
    result.append(", url: ");
    result.append(url);
    result.append(')');
    return result.toString();
  }

} //PushImpl
