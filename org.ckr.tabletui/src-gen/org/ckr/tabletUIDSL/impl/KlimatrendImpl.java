/**
 */
package org.ckr.tabletUIDSL.impl;

import org.ckr.tabletUIDSL.Color;
import org.ckr.tabletUIDSL.Klimatrend;
import org.ckr.tabletUIDSL.TabletUIDSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Klimatrend</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ckr.tabletUIDSL.impl.KlimatrendImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.KlimatrendImpl#getGet <em>Get</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.KlimatrendImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.KlimatrendImpl#getRefperiod <em>Refperiod</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.KlimatrendImpl#getStagnatingColor <em>Stagnating Color</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.KlimatrendImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.KlimatrendImpl#getRisingColor <em>Rising Color</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.KlimatrendImpl#getFallingColor <em>Falling Color</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.KlimatrendImpl#getHighmark <em>Highmark</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.KlimatrendImpl#getHighmarkIcon <em>Highmark Icon</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.KlimatrendImpl#getHighmarkRisingColor <em>Highmark Rising Color</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.KlimatrendImpl#getHighmarkFallingColor <em>Highmark Falling Color</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KlimatrendImpl extends WidgetImpl implements Klimatrend
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
   * The default value of the '{@link #getRefperiod() <em>Refperiod</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefperiod()
   * @generated
   * @ordered
   */
  protected static final int REFPERIOD_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getRefperiod() <em>Refperiod</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefperiod()
   * @generated
   * @ordered
   */
  protected int refperiod = REFPERIOD_EDEFAULT;

  /**
   * The cached value of the '{@link #getStagnatingColor() <em>Stagnating Color</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStagnatingColor()
   * @generated
   * @ordered
   */
  protected Color stagnatingColor;

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
   * The cached value of the '{@link #getRisingColor() <em>Rising Color</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRisingColor()
   * @generated
   * @ordered
   */
  protected Color risingColor;

  /**
   * The cached value of the '{@link #getFallingColor() <em>Falling Color</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFallingColor()
   * @generated
   * @ordered
   */
  protected Color fallingColor;

  /**
   * The default value of the '{@link #getHighmark() <em>Highmark</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHighmark()
   * @generated
   * @ordered
   */
  protected static final int HIGHMARK_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getHighmark() <em>Highmark</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHighmark()
   * @generated
   * @ordered
   */
  protected int highmark = HIGHMARK_EDEFAULT;

  /**
   * The default value of the '{@link #getHighmarkIcon() <em>Highmark Icon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHighmarkIcon()
   * @generated
   * @ordered
   */
  protected static final String HIGHMARK_ICON_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHighmarkIcon() <em>Highmark Icon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHighmarkIcon()
   * @generated
   * @ordered
   */
  protected String highmarkIcon = HIGHMARK_ICON_EDEFAULT;

  /**
   * The cached value of the '{@link #getHighmarkRisingColor() <em>Highmark Rising Color</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHighmarkRisingColor()
   * @generated
   * @ordered
   */
  protected Color highmarkRisingColor;

  /**
   * The cached value of the '{@link #getHighmarkFallingColor() <em>Highmark Falling Color</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHighmarkFallingColor()
   * @generated
   * @ordered
   */
  protected Color highmarkFallingColor;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected KlimatrendImpl()
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
    return TabletUIDSLPackage.Literals.KLIMATREND;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.KLIMATREND__DEVICE, oldDevice, device));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.KLIMATREND__GET, oldGet, get));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.KLIMATREND__CLASS, oldClass, class_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getRefperiod()
  {
    return refperiod;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRefperiod(int newRefperiod)
  {
    int oldRefperiod = refperiod;
    refperiod = newRefperiod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.KLIMATREND__REFPERIOD, oldRefperiod, refperiod));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getStagnatingColor()
  {
    if (stagnatingColor != null && stagnatingColor.eIsProxy())
    {
      InternalEObject oldStagnatingColor = (InternalEObject)stagnatingColor;
      stagnatingColor = (Color)eResolveProxy(oldStagnatingColor);
      if (stagnatingColor != oldStagnatingColor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TabletUIDSLPackage.KLIMATREND__STAGNATING_COLOR, oldStagnatingColor, stagnatingColor));
      }
    }
    return stagnatingColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color basicGetStagnatingColor()
  {
    return stagnatingColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStagnatingColor(Color newStagnatingColor)
  {
    Color oldStagnatingColor = stagnatingColor;
    stagnatingColor = newStagnatingColor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.KLIMATREND__STAGNATING_COLOR, oldStagnatingColor, stagnatingColor));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.KLIMATREND__ICON, oldIcon, icon));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getRisingColor()
  {
    if (risingColor != null && risingColor.eIsProxy())
    {
      InternalEObject oldRisingColor = (InternalEObject)risingColor;
      risingColor = (Color)eResolveProxy(oldRisingColor);
      if (risingColor != oldRisingColor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TabletUIDSLPackage.KLIMATREND__RISING_COLOR, oldRisingColor, risingColor));
      }
    }
    return risingColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color basicGetRisingColor()
  {
    return risingColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRisingColor(Color newRisingColor)
  {
    Color oldRisingColor = risingColor;
    risingColor = newRisingColor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.KLIMATREND__RISING_COLOR, oldRisingColor, risingColor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getFallingColor()
  {
    if (fallingColor != null && fallingColor.eIsProxy())
    {
      InternalEObject oldFallingColor = (InternalEObject)fallingColor;
      fallingColor = (Color)eResolveProxy(oldFallingColor);
      if (fallingColor != oldFallingColor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TabletUIDSLPackage.KLIMATREND__FALLING_COLOR, oldFallingColor, fallingColor));
      }
    }
    return fallingColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color basicGetFallingColor()
  {
    return fallingColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFallingColor(Color newFallingColor)
  {
    Color oldFallingColor = fallingColor;
    fallingColor = newFallingColor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.KLIMATREND__FALLING_COLOR, oldFallingColor, fallingColor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getHighmark()
  {
    return highmark;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHighmark(int newHighmark)
  {
    int oldHighmark = highmark;
    highmark = newHighmark;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.KLIMATREND__HIGHMARK, oldHighmark, highmark));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHighmarkIcon()
  {
    return highmarkIcon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHighmarkIcon(String newHighmarkIcon)
  {
    String oldHighmarkIcon = highmarkIcon;
    highmarkIcon = newHighmarkIcon;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.KLIMATREND__HIGHMARK_ICON, oldHighmarkIcon, highmarkIcon));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getHighmarkRisingColor()
  {
    if (highmarkRisingColor != null && highmarkRisingColor.eIsProxy())
    {
      InternalEObject oldHighmarkRisingColor = (InternalEObject)highmarkRisingColor;
      highmarkRisingColor = (Color)eResolveProxy(oldHighmarkRisingColor);
      if (highmarkRisingColor != oldHighmarkRisingColor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TabletUIDSLPackage.KLIMATREND__HIGHMARK_RISING_COLOR, oldHighmarkRisingColor, highmarkRisingColor));
      }
    }
    return highmarkRisingColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color basicGetHighmarkRisingColor()
  {
    return highmarkRisingColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHighmarkRisingColor(Color newHighmarkRisingColor)
  {
    Color oldHighmarkRisingColor = highmarkRisingColor;
    highmarkRisingColor = newHighmarkRisingColor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.KLIMATREND__HIGHMARK_RISING_COLOR, oldHighmarkRisingColor, highmarkRisingColor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getHighmarkFallingColor()
  {
    if (highmarkFallingColor != null && highmarkFallingColor.eIsProxy())
    {
      InternalEObject oldHighmarkFallingColor = (InternalEObject)highmarkFallingColor;
      highmarkFallingColor = (Color)eResolveProxy(oldHighmarkFallingColor);
      if (highmarkFallingColor != oldHighmarkFallingColor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TabletUIDSLPackage.KLIMATREND__HIGHMARK_FALLING_COLOR, oldHighmarkFallingColor, highmarkFallingColor));
      }
    }
    return highmarkFallingColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color basicGetHighmarkFallingColor()
  {
    return highmarkFallingColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHighmarkFallingColor(Color newHighmarkFallingColor)
  {
    Color oldHighmarkFallingColor = highmarkFallingColor;
    highmarkFallingColor = newHighmarkFallingColor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.KLIMATREND__HIGHMARK_FALLING_COLOR, oldHighmarkFallingColor, highmarkFallingColor));
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
      case TabletUIDSLPackage.KLIMATREND__DEVICE:
        return getDevice();
      case TabletUIDSLPackage.KLIMATREND__GET:
        return getGet();
      case TabletUIDSLPackage.KLIMATREND__CLASS:
        return getClass_();
      case TabletUIDSLPackage.KLIMATREND__REFPERIOD:
        return getRefperiod();
      case TabletUIDSLPackage.KLIMATREND__STAGNATING_COLOR:
        if (resolve) return getStagnatingColor();
        return basicGetStagnatingColor();
      case TabletUIDSLPackage.KLIMATREND__ICON:
        return getIcon();
      case TabletUIDSLPackage.KLIMATREND__RISING_COLOR:
        if (resolve) return getRisingColor();
        return basicGetRisingColor();
      case TabletUIDSLPackage.KLIMATREND__FALLING_COLOR:
        if (resolve) return getFallingColor();
        return basicGetFallingColor();
      case TabletUIDSLPackage.KLIMATREND__HIGHMARK:
        return getHighmark();
      case TabletUIDSLPackage.KLIMATREND__HIGHMARK_ICON:
        return getHighmarkIcon();
      case TabletUIDSLPackage.KLIMATREND__HIGHMARK_RISING_COLOR:
        if (resolve) return getHighmarkRisingColor();
        return basicGetHighmarkRisingColor();
      case TabletUIDSLPackage.KLIMATREND__HIGHMARK_FALLING_COLOR:
        if (resolve) return getHighmarkFallingColor();
        return basicGetHighmarkFallingColor();
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
      case TabletUIDSLPackage.KLIMATREND__DEVICE:
        setDevice((String)newValue);
        return;
      case TabletUIDSLPackage.KLIMATREND__GET:
        setGet((String)newValue);
        return;
      case TabletUIDSLPackage.KLIMATREND__CLASS:
        setClass((String)newValue);
        return;
      case TabletUIDSLPackage.KLIMATREND__REFPERIOD:
        setRefperiod((Integer)newValue);
        return;
      case TabletUIDSLPackage.KLIMATREND__STAGNATING_COLOR:
        setStagnatingColor((Color)newValue);
        return;
      case TabletUIDSLPackage.KLIMATREND__ICON:
        setIcon((String)newValue);
        return;
      case TabletUIDSLPackage.KLIMATREND__RISING_COLOR:
        setRisingColor((Color)newValue);
        return;
      case TabletUIDSLPackage.KLIMATREND__FALLING_COLOR:
        setFallingColor((Color)newValue);
        return;
      case TabletUIDSLPackage.KLIMATREND__HIGHMARK:
        setHighmark((Integer)newValue);
        return;
      case TabletUIDSLPackage.KLIMATREND__HIGHMARK_ICON:
        setHighmarkIcon((String)newValue);
        return;
      case TabletUIDSLPackage.KLIMATREND__HIGHMARK_RISING_COLOR:
        setHighmarkRisingColor((Color)newValue);
        return;
      case TabletUIDSLPackage.KLIMATREND__HIGHMARK_FALLING_COLOR:
        setHighmarkFallingColor((Color)newValue);
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
      case TabletUIDSLPackage.KLIMATREND__DEVICE:
        setDevice(DEVICE_EDEFAULT);
        return;
      case TabletUIDSLPackage.KLIMATREND__GET:
        setGet(GET_EDEFAULT);
        return;
      case TabletUIDSLPackage.KLIMATREND__CLASS:
        setClass(CLASS_EDEFAULT);
        return;
      case TabletUIDSLPackage.KLIMATREND__REFPERIOD:
        setRefperiod(REFPERIOD_EDEFAULT);
        return;
      case TabletUIDSLPackage.KLIMATREND__STAGNATING_COLOR:
        setStagnatingColor((Color)null);
        return;
      case TabletUIDSLPackage.KLIMATREND__ICON:
        setIcon(ICON_EDEFAULT);
        return;
      case TabletUIDSLPackage.KLIMATREND__RISING_COLOR:
        setRisingColor((Color)null);
        return;
      case TabletUIDSLPackage.KLIMATREND__FALLING_COLOR:
        setFallingColor((Color)null);
        return;
      case TabletUIDSLPackage.KLIMATREND__HIGHMARK:
        setHighmark(HIGHMARK_EDEFAULT);
        return;
      case TabletUIDSLPackage.KLIMATREND__HIGHMARK_ICON:
        setHighmarkIcon(HIGHMARK_ICON_EDEFAULT);
        return;
      case TabletUIDSLPackage.KLIMATREND__HIGHMARK_RISING_COLOR:
        setHighmarkRisingColor((Color)null);
        return;
      case TabletUIDSLPackage.KLIMATREND__HIGHMARK_FALLING_COLOR:
        setHighmarkFallingColor((Color)null);
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
      case TabletUIDSLPackage.KLIMATREND__DEVICE:
        return DEVICE_EDEFAULT == null ? device != null : !DEVICE_EDEFAULT.equals(device);
      case TabletUIDSLPackage.KLIMATREND__GET:
        return GET_EDEFAULT == null ? get != null : !GET_EDEFAULT.equals(get);
      case TabletUIDSLPackage.KLIMATREND__CLASS:
        return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
      case TabletUIDSLPackage.KLIMATREND__REFPERIOD:
        return refperiod != REFPERIOD_EDEFAULT;
      case TabletUIDSLPackage.KLIMATREND__STAGNATING_COLOR:
        return stagnatingColor != null;
      case TabletUIDSLPackage.KLIMATREND__ICON:
        return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
      case TabletUIDSLPackage.KLIMATREND__RISING_COLOR:
        return risingColor != null;
      case TabletUIDSLPackage.KLIMATREND__FALLING_COLOR:
        return fallingColor != null;
      case TabletUIDSLPackage.KLIMATREND__HIGHMARK:
        return highmark != HIGHMARK_EDEFAULT;
      case TabletUIDSLPackage.KLIMATREND__HIGHMARK_ICON:
        return HIGHMARK_ICON_EDEFAULT == null ? highmarkIcon != null : !HIGHMARK_ICON_EDEFAULT.equals(highmarkIcon);
      case TabletUIDSLPackage.KLIMATREND__HIGHMARK_RISING_COLOR:
        return highmarkRisingColor != null;
      case TabletUIDSLPackage.KLIMATREND__HIGHMARK_FALLING_COLOR:
        return highmarkFallingColor != null;
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
    result.append(", class: ");
    result.append(class_);
    result.append(", refperiod: ");
    result.append(refperiod);
    result.append(", icon: ");
    result.append(icon);
    result.append(", highmark: ");
    result.append(highmark);
    result.append(", highmarkIcon: ");
    result.append(highmarkIcon);
    result.append(')');
    return result.toString();
  }

} //KlimatrendImpl
