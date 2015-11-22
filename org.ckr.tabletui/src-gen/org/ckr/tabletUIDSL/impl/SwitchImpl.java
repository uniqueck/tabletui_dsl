/**
 */
package org.ckr.tabletUIDSL.impl;

import org.ckr.tabletUIDSL.Color;
import org.ckr.tabletUIDSL.Switch;
import org.ckr.tabletUIDSL.TabletUIDSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SwitchImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SwitchImpl#getGet <em>Get</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SwitchImpl#getGetOn <em>Get On</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SwitchImpl#getGetOff <em>Get Off</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SwitchImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SwitchImpl#getOnColor <em>On Color</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SwitchImpl#getOffColor <em>Off Color</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SwitchImpl#getOnBackGroundColor <em>On Back Ground Color</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SwitchImpl#getBackgroundIcon <em>Background Icon</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SwitchImpl#getIcon <em>Icon</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchImpl extends WidgetImpl implements Switch
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
   * The default value of the '{@link #getGetOn() <em>Get On</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGetOn()
   * @generated
   * @ordered
   */
  protected static final String GET_ON_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGetOn() <em>Get On</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGetOn()
   * @generated
   * @ordered
   */
  protected String getOn = GET_ON_EDEFAULT;

  /**
   * The default value of the '{@link #getGetOff() <em>Get Off</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGetOff()
   * @generated
   * @ordered
   */
  protected static final String GET_OFF_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGetOff() <em>Get Off</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGetOff()
   * @generated
   * @ordered
   */
  protected String getOff = GET_OFF_EDEFAULT;

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
   * The cached value of the '{@link #getOnColor() <em>On Color</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOnColor()
   * @generated
   * @ordered
   */
  protected Color onColor;

  /**
   * The cached value of the '{@link #getOffColor() <em>Off Color</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOffColor()
   * @generated
   * @ordered
   */
  protected Color offColor;

  /**
   * The cached value of the '{@link #getOnBackGroundColor() <em>On Back Ground Color</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOnBackGroundColor()
   * @generated
   * @ordered
   */
  protected Color onBackGroundColor;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SwitchImpl()
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
    return TabletUIDSLPackage.Literals.SWITCH;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SWITCH__DEVICE, oldDevice, device));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SWITCH__GET, oldGet, get));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGetOn()
  {
    return getOn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGetOn(String newGetOn)
  {
    String oldGetOn = getOn;
    getOn = newGetOn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SWITCH__GET_ON, oldGetOn, getOn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGetOff()
  {
    return getOff;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGetOff(String newGetOff)
  {
    String oldGetOff = getOff;
    getOff = newGetOff;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SWITCH__GET_OFF, oldGetOff, getOff));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SWITCH__CLASS, oldClass, class_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getOnColor()
  {
    if (onColor != null && onColor.eIsProxy())
    {
      InternalEObject oldOnColor = (InternalEObject)onColor;
      onColor = (Color)eResolveProxy(oldOnColor);
      if (onColor != oldOnColor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TabletUIDSLPackage.SWITCH__ON_COLOR, oldOnColor, onColor));
      }
    }
    return onColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color basicGetOnColor()
  {
    return onColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOnColor(Color newOnColor)
  {
    Color oldOnColor = onColor;
    onColor = newOnColor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SWITCH__ON_COLOR, oldOnColor, onColor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getOffColor()
  {
    if (offColor != null && offColor.eIsProxy())
    {
      InternalEObject oldOffColor = (InternalEObject)offColor;
      offColor = (Color)eResolveProxy(oldOffColor);
      if (offColor != oldOffColor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TabletUIDSLPackage.SWITCH__OFF_COLOR, oldOffColor, offColor));
      }
    }
    return offColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color basicGetOffColor()
  {
    return offColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOffColor(Color newOffColor)
  {
    Color oldOffColor = offColor;
    offColor = newOffColor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SWITCH__OFF_COLOR, oldOffColor, offColor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getOnBackGroundColor()
  {
    if (onBackGroundColor != null && onBackGroundColor.eIsProxy())
    {
      InternalEObject oldOnBackGroundColor = (InternalEObject)onBackGroundColor;
      onBackGroundColor = (Color)eResolveProxy(oldOnBackGroundColor);
      if (onBackGroundColor != oldOnBackGroundColor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TabletUIDSLPackage.SWITCH__ON_BACK_GROUND_COLOR, oldOnBackGroundColor, onBackGroundColor));
      }
    }
    return onBackGroundColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color basicGetOnBackGroundColor()
  {
    return onBackGroundColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOnBackGroundColor(Color newOnBackGroundColor)
  {
    Color oldOnBackGroundColor = onBackGroundColor;
    onBackGroundColor = newOnBackGroundColor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SWITCH__ON_BACK_GROUND_COLOR, oldOnBackGroundColor, onBackGroundColor));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SWITCH__BACKGROUND_ICON, oldBackgroundIcon, backgroundIcon));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SWITCH__ICON, oldIcon, icon));
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
      case TabletUIDSLPackage.SWITCH__DEVICE:
        return getDevice();
      case TabletUIDSLPackage.SWITCH__GET:
        return getGet();
      case TabletUIDSLPackage.SWITCH__GET_ON:
        return getGetOn();
      case TabletUIDSLPackage.SWITCH__GET_OFF:
        return getGetOff();
      case TabletUIDSLPackage.SWITCH__CLASS:
        return getClass_();
      case TabletUIDSLPackage.SWITCH__ON_COLOR:
        if (resolve) return getOnColor();
        return basicGetOnColor();
      case TabletUIDSLPackage.SWITCH__OFF_COLOR:
        if (resolve) return getOffColor();
        return basicGetOffColor();
      case TabletUIDSLPackage.SWITCH__ON_BACK_GROUND_COLOR:
        if (resolve) return getOnBackGroundColor();
        return basicGetOnBackGroundColor();
      case TabletUIDSLPackage.SWITCH__BACKGROUND_ICON:
        return getBackgroundIcon();
      case TabletUIDSLPackage.SWITCH__ICON:
        return getIcon();
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
      case TabletUIDSLPackage.SWITCH__DEVICE:
        setDevice((String)newValue);
        return;
      case TabletUIDSLPackage.SWITCH__GET:
        setGet((String)newValue);
        return;
      case TabletUIDSLPackage.SWITCH__GET_ON:
        setGetOn((String)newValue);
        return;
      case TabletUIDSLPackage.SWITCH__GET_OFF:
        setGetOff((String)newValue);
        return;
      case TabletUIDSLPackage.SWITCH__CLASS:
        setClass((String)newValue);
        return;
      case TabletUIDSLPackage.SWITCH__ON_COLOR:
        setOnColor((Color)newValue);
        return;
      case TabletUIDSLPackage.SWITCH__OFF_COLOR:
        setOffColor((Color)newValue);
        return;
      case TabletUIDSLPackage.SWITCH__ON_BACK_GROUND_COLOR:
        setOnBackGroundColor((Color)newValue);
        return;
      case TabletUIDSLPackage.SWITCH__BACKGROUND_ICON:
        setBackgroundIcon((String)newValue);
        return;
      case TabletUIDSLPackage.SWITCH__ICON:
        setIcon((String)newValue);
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
      case TabletUIDSLPackage.SWITCH__DEVICE:
        setDevice(DEVICE_EDEFAULT);
        return;
      case TabletUIDSLPackage.SWITCH__GET:
        setGet(GET_EDEFAULT);
        return;
      case TabletUIDSLPackage.SWITCH__GET_ON:
        setGetOn(GET_ON_EDEFAULT);
        return;
      case TabletUIDSLPackage.SWITCH__GET_OFF:
        setGetOff(GET_OFF_EDEFAULT);
        return;
      case TabletUIDSLPackage.SWITCH__CLASS:
        setClass(CLASS_EDEFAULT);
        return;
      case TabletUIDSLPackage.SWITCH__ON_COLOR:
        setOnColor((Color)null);
        return;
      case TabletUIDSLPackage.SWITCH__OFF_COLOR:
        setOffColor((Color)null);
        return;
      case TabletUIDSLPackage.SWITCH__ON_BACK_GROUND_COLOR:
        setOnBackGroundColor((Color)null);
        return;
      case TabletUIDSLPackage.SWITCH__BACKGROUND_ICON:
        setBackgroundIcon(BACKGROUND_ICON_EDEFAULT);
        return;
      case TabletUIDSLPackage.SWITCH__ICON:
        setIcon(ICON_EDEFAULT);
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
      case TabletUIDSLPackage.SWITCH__DEVICE:
        return DEVICE_EDEFAULT == null ? device != null : !DEVICE_EDEFAULT.equals(device);
      case TabletUIDSLPackage.SWITCH__GET:
        return GET_EDEFAULT == null ? get != null : !GET_EDEFAULT.equals(get);
      case TabletUIDSLPackage.SWITCH__GET_ON:
        return GET_ON_EDEFAULT == null ? getOn != null : !GET_ON_EDEFAULT.equals(getOn);
      case TabletUIDSLPackage.SWITCH__GET_OFF:
        return GET_OFF_EDEFAULT == null ? getOff != null : !GET_OFF_EDEFAULT.equals(getOff);
      case TabletUIDSLPackage.SWITCH__CLASS:
        return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
      case TabletUIDSLPackage.SWITCH__ON_COLOR:
        return onColor != null;
      case TabletUIDSLPackage.SWITCH__OFF_COLOR:
        return offColor != null;
      case TabletUIDSLPackage.SWITCH__ON_BACK_GROUND_COLOR:
        return onBackGroundColor != null;
      case TabletUIDSLPackage.SWITCH__BACKGROUND_ICON:
        return BACKGROUND_ICON_EDEFAULT == null ? backgroundIcon != null : !BACKGROUND_ICON_EDEFAULT.equals(backgroundIcon);
      case TabletUIDSLPackage.SWITCH__ICON:
        return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
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
    result.append(", get: ");
    result.append(get);
    result.append(", getOn: ");
    result.append(getOn);
    result.append(", getOff: ");
    result.append(getOff);
    result.append(", class: ");
    result.append(class_);
    result.append(", backgroundIcon: ");
    result.append(backgroundIcon);
    result.append(", icon: ");
    result.append(icon);
    result.append(')');
    return result.toString();
  }

} //SwitchImpl
