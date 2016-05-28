/**
 */
package org.ckr.tabletUIDSL.impl;

import org.ckr.tabletUIDSL.Button;
import org.ckr.tabletUIDSL.ButtonUrl;
import org.ckr.tabletUIDSL.Color;
import org.ckr.tabletUIDSL.TabletUIDSLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Button</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ckr.tabletUIDSL.impl.ButtonImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.ButtonImpl#getGet <em>Get</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.ButtonImpl#getGetOn <em>Get On</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.ButtonImpl#getGetWarn <em>Get Warn</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.ButtonImpl#getGetOff <em>Get Off</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.ButtonImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.ButtonImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.ButtonImpl#getBackgroundIcon <em>Background Icon</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.ButtonImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.ButtonImpl#getOnColor <em>On Color</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.ButtonImpl#getOnBackgroundColor <em>On Background Color</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.ButtonImpl#getOffColor <em>Off Color</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.ButtonImpl#getOffBackgroundColor <em>Off Background Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ButtonImpl extends WidgetImpl implements Button
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
   * The default value of the '{@link #getGetWarn() <em>Get Warn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGetWarn()
   * @generated
   * @ordered
   */
  protected static final String GET_WARN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getGetWarn() <em>Get Warn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGetWarn()
   * @generated
   * @ordered
   */
  protected String getWarn = GET_WARN_EDEFAULT;

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
   * The cached value of the '{@link #getTarget() <em>Target</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected ButtonUrl target;

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
   * The cached value of the '{@link #getOnBackgroundColor() <em>On Background Color</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOnBackgroundColor()
   * @generated
   * @ordered
   */
  protected Color onBackgroundColor;

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
   * The cached value of the '{@link #getOffBackgroundColor() <em>Off Background Color</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOffBackgroundColor()
   * @generated
   * @ordered
   */
  protected Color offBackgroundColor;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ButtonImpl()
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
    return TabletUIDSLPackage.Literals.BUTTON;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.BUTTON__DEVICE, oldDevice, device));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.BUTTON__GET, oldGet, get));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.BUTTON__GET_ON, oldGetOn, getOn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getGetWarn()
  {
    return getWarn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setGetWarn(String newGetWarn)
  {
    String oldGetWarn = getWarn;
    getWarn = newGetWarn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.BUTTON__GET_WARN, oldGetWarn, getWarn));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.BUTTON__GET_OFF, oldGetOff, getOff));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ButtonUrl getTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetTarget(ButtonUrl newTarget, NotificationChain msgs)
  {
    ButtonUrl oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.BUTTON__TARGET, oldTarget, newTarget);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(ButtonUrl newTarget)
  {
    if (newTarget != target)
    {
      NotificationChain msgs = null;
      if (target != null)
        msgs = ((InternalEObject)target).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TabletUIDSLPackage.BUTTON__TARGET, null, msgs);
      if (newTarget != null)
        msgs = ((InternalEObject)newTarget).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TabletUIDSLPackage.BUTTON__TARGET, null, msgs);
      msgs = basicSetTarget(newTarget, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.BUTTON__TARGET, newTarget, newTarget));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.BUTTON__ICON, oldIcon, icon));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.BUTTON__BACKGROUND_ICON, oldBackgroundIcon, backgroundIcon));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.BUTTON__CLASS, oldClass, class_));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TabletUIDSLPackage.BUTTON__ON_COLOR, oldOnColor, onColor));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.BUTTON__ON_COLOR, oldOnColor, onColor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getOnBackgroundColor()
  {
    if (onBackgroundColor != null && onBackgroundColor.eIsProxy())
    {
      InternalEObject oldOnBackgroundColor = (InternalEObject)onBackgroundColor;
      onBackgroundColor = (Color)eResolveProxy(oldOnBackgroundColor);
      if (onBackgroundColor != oldOnBackgroundColor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TabletUIDSLPackage.BUTTON__ON_BACKGROUND_COLOR, oldOnBackgroundColor, onBackgroundColor));
      }
    }
    return onBackgroundColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color basicGetOnBackgroundColor()
  {
    return onBackgroundColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOnBackgroundColor(Color newOnBackgroundColor)
  {
    Color oldOnBackgroundColor = onBackgroundColor;
    onBackgroundColor = newOnBackgroundColor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.BUTTON__ON_BACKGROUND_COLOR, oldOnBackgroundColor, onBackgroundColor));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TabletUIDSLPackage.BUTTON__OFF_COLOR, oldOffColor, offColor));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.BUTTON__OFF_COLOR, oldOffColor, offColor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getOffBackgroundColor()
  {
    if (offBackgroundColor != null && offBackgroundColor.eIsProxy())
    {
      InternalEObject oldOffBackgroundColor = (InternalEObject)offBackgroundColor;
      offBackgroundColor = (Color)eResolveProxy(oldOffBackgroundColor);
      if (offBackgroundColor != oldOffBackgroundColor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TabletUIDSLPackage.BUTTON__OFF_BACKGROUND_COLOR, oldOffBackgroundColor, offBackgroundColor));
      }
    }
    return offBackgroundColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color basicGetOffBackgroundColor()
  {
    return offBackgroundColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOffBackgroundColor(Color newOffBackgroundColor)
  {
    Color oldOffBackgroundColor = offBackgroundColor;
    offBackgroundColor = newOffBackgroundColor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.BUTTON__OFF_BACKGROUND_COLOR, oldOffBackgroundColor, offBackgroundColor));
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
      case TabletUIDSLPackage.BUTTON__TARGET:
        return basicSetTarget(null, msgs);
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
      case TabletUIDSLPackage.BUTTON__DEVICE:
        return getDevice();
      case TabletUIDSLPackage.BUTTON__GET:
        return getGet();
      case TabletUIDSLPackage.BUTTON__GET_ON:
        return getGetOn();
      case TabletUIDSLPackage.BUTTON__GET_WARN:
        return getGetWarn();
      case TabletUIDSLPackage.BUTTON__GET_OFF:
        return getGetOff();
      case TabletUIDSLPackage.BUTTON__TARGET:
        return getTarget();
      case TabletUIDSLPackage.BUTTON__ICON:
        return getIcon();
      case TabletUIDSLPackage.BUTTON__BACKGROUND_ICON:
        return getBackgroundIcon();
      case TabletUIDSLPackage.BUTTON__CLASS:
        return getClass_();
      case TabletUIDSLPackage.BUTTON__ON_COLOR:
        if (resolve) return getOnColor();
        return basicGetOnColor();
      case TabletUIDSLPackage.BUTTON__ON_BACKGROUND_COLOR:
        if (resolve) return getOnBackgroundColor();
        return basicGetOnBackgroundColor();
      case TabletUIDSLPackage.BUTTON__OFF_COLOR:
        if (resolve) return getOffColor();
        return basicGetOffColor();
      case TabletUIDSLPackage.BUTTON__OFF_BACKGROUND_COLOR:
        if (resolve) return getOffBackgroundColor();
        return basicGetOffBackgroundColor();
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
      case TabletUIDSLPackage.BUTTON__DEVICE:
        setDevice((String)newValue);
        return;
      case TabletUIDSLPackage.BUTTON__GET:
        setGet((String)newValue);
        return;
      case TabletUIDSLPackage.BUTTON__GET_ON:
        setGetOn((String)newValue);
        return;
      case TabletUIDSLPackage.BUTTON__GET_WARN:
        setGetWarn((String)newValue);
        return;
      case TabletUIDSLPackage.BUTTON__GET_OFF:
        setGetOff((String)newValue);
        return;
      case TabletUIDSLPackage.BUTTON__TARGET:
        setTarget((ButtonUrl)newValue);
        return;
      case TabletUIDSLPackage.BUTTON__ICON:
        setIcon((String)newValue);
        return;
      case TabletUIDSLPackage.BUTTON__BACKGROUND_ICON:
        setBackgroundIcon((String)newValue);
        return;
      case TabletUIDSLPackage.BUTTON__CLASS:
        setClass((String)newValue);
        return;
      case TabletUIDSLPackage.BUTTON__ON_COLOR:
        setOnColor((Color)newValue);
        return;
      case TabletUIDSLPackage.BUTTON__ON_BACKGROUND_COLOR:
        setOnBackgroundColor((Color)newValue);
        return;
      case TabletUIDSLPackage.BUTTON__OFF_COLOR:
        setOffColor((Color)newValue);
        return;
      case TabletUIDSLPackage.BUTTON__OFF_BACKGROUND_COLOR:
        setOffBackgroundColor((Color)newValue);
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
      case TabletUIDSLPackage.BUTTON__DEVICE:
        setDevice(DEVICE_EDEFAULT);
        return;
      case TabletUIDSLPackage.BUTTON__GET:
        setGet(GET_EDEFAULT);
        return;
      case TabletUIDSLPackage.BUTTON__GET_ON:
        setGetOn(GET_ON_EDEFAULT);
        return;
      case TabletUIDSLPackage.BUTTON__GET_WARN:
        setGetWarn(GET_WARN_EDEFAULT);
        return;
      case TabletUIDSLPackage.BUTTON__GET_OFF:
        setGetOff(GET_OFF_EDEFAULT);
        return;
      case TabletUIDSLPackage.BUTTON__TARGET:
        setTarget((ButtonUrl)null);
        return;
      case TabletUIDSLPackage.BUTTON__ICON:
        setIcon(ICON_EDEFAULT);
        return;
      case TabletUIDSLPackage.BUTTON__BACKGROUND_ICON:
        setBackgroundIcon(BACKGROUND_ICON_EDEFAULT);
        return;
      case TabletUIDSLPackage.BUTTON__CLASS:
        setClass(CLASS_EDEFAULT);
        return;
      case TabletUIDSLPackage.BUTTON__ON_COLOR:
        setOnColor((Color)null);
        return;
      case TabletUIDSLPackage.BUTTON__ON_BACKGROUND_COLOR:
        setOnBackgroundColor((Color)null);
        return;
      case TabletUIDSLPackage.BUTTON__OFF_COLOR:
        setOffColor((Color)null);
        return;
      case TabletUIDSLPackage.BUTTON__OFF_BACKGROUND_COLOR:
        setOffBackgroundColor((Color)null);
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
      case TabletUIDSLPackage.BUTTON__DEVICE:
        return DEVICE_EDEFAULT == null ? device != null : !DEVICE_EDEFAULT.equals(device);
      case TabletUIDSLPackage.BUTTON__GET:
        return GET_EDEFAULT == null ? get != null : !GET_EDEFAULT.equals(get);
      case TabletUIDSLPackage.BUTTON__GET_ON:
        return GET_ON_EDEFAULT == null ? getOn != null : !GET_ON_EDEFAULT.equals(getOn);
      case TabletUIDSLPackage.BUTTON__GET_WARN:
        return GET_WARN_EDEFAULT == null ? getWarn != null : !GET_WARN_EDEFAULT.equals(getWarn);
      case TabletUIDSLPackage.BUTTON__GET_OFF:
        return GET_OFF_EDEFAULT == null ? getOff != null : !GET_OFF_EDEFAULT.equals(getOff);
      case TabletUIDSLPackage.BUTTON__TARGET:
        return target != null;
      case TabletUIDSLPackage.BUTTON__ICON:
        return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
      case TabletUIDSLPackage.BUTTON__BACKGROUND_ICON:
        return BACKGROUND_ICON_EDEFAULT == null ? backgroundIcon != null : !BACKGROUND_ICON_EDEFAULT.equals(backgroundIcon);
      case TabletUIDSLPackage.BUTTON__CLASS:
        return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
      case TabletUIDSLPackage.BUTTON__ON_COLOR:
        return onColor != null;
      case TabletUIDSLPackage.BUTTON__ON_BACKGROUND_COLOR:
        return onBackgroundColor != null;
      case TabletUIDSLPackage.BUTTON__OFF_COLOR:
        return offColor != null;
      case TabletUIDSLPackage.BUTTON__OFF_BACKGROUND_COLOR:
        return offBackgroundColor != null;
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
    result.append(", getWarn: ");
    result.append(getWarn);
    result.append(", getOff: ");
    result.append(getOff);
    result.append(", icon: ");
    result.append(icon);
    result.append(", backgroundIcon: ");
    result.append(backgroundIcon);
    result.append(", class: ");
    result.append(class_);
    result.append(')');
    return result.toString();
  }

} //ButtonImpl
