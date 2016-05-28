/**
 */
package org.ckr.tabletUIDSL.impl;

import java.util.Collection;

import org.ckr.tabletUIDSL.Color;
import org.ckr.tabletUIDSL.Symbol;
import org.ckr.tabletUIDSL.TabletUIDSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Symbol</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SymbolImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SymbolImpl#getGet <em>Get</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SymbolImpl#getGetOn <em>Get On</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SymbolImpl#getGetWarn <em>Get Warn</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SymbolImpl#getGetOff <em>Get Off</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SymbolImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SymbolImpl#getBgicon <em>Bgicon</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SymbolImpl#getOffColor <em>Off Color</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SymbolImpl#getIcons <em>Icons</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SymbolImpl#getOnColors <em>On Colors</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SymbolImpl#getOnBackgroundColors <em>On Background Colors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SymbolImpl extends WidgetImpl implements Symbol
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
   * The cached value of the '{@link #getGetOn() <em>Get On</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGetOn()
   * @generated
   * @ordered
   */
  protected EList<String> getOn;

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
   * The cached value of the '{@link #getGetOff() <em>Get Off</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGetOff()
   * @generated
   * @ordered
   */
  protected EList<String> getOff;

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
   * The default value of the '{@link #getBgicon() <em>Bgicon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBgicon()
   * @generated
   * @ordered
   */
  protected static final String BGICON_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBgicon() <em>Bgicon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBgicon()
   * @generated
   * @ordered
   */
  protected String bgicon = BGICON_EDEFAULT;

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
   * The cached value of the '{@link #getIcons() <em>Icons</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIcons()
   * @generated
   * @ordered
   */
  protected EList<String> icons;

  /**
   * The cached value of the '{@link #getOnColors() <em>On Colors</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOnColors()
   * @generated
   * @ordered
   */
  protected EList<Color> onColors;

  /**
   * The cached value of the '{@link #getOnBackgroundColors() <em>On Background Colors</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOnBackgroundColors()
   * @generated
   * @ordered
   */
  protected EList<Color> onBackgroundColors;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SymbolImpl()
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
    return TabletUIDSLPackage.Literals.SYMBOL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SYMBOL__DEVICE, oldDevice, device));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SYMBOL__GET, oldGet, get));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getGetOn()
  {
    if (getOn == null)
    {
      getOn = new EDataTypeEList<String>(String.class, this, TabletUIDSLPackage.SYMBOL__GET_ON);
    }
    return getOn;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SYMBOL__GET_WARN, oldGetWarn, getWarn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getGetOff()
  {
    if (getOff == null)
    {
      getOff = new EDataTypeEList<String>(String.class, this, TabletUIDSLPackage.SYMBOL__GET_OFF);
    }
    return getOff;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SYMBOL__CLASS, oldClass, class_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getBgicon()
  {
    return bgicon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBgicon(String newBgicon)
  {
    String oldBgicon = bgicon;
    bgicon = newBgicon;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SYMBOL__BGICON, oldBgicon, bgicon));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TabletUIDSLPackage.SYMBOL__OFF_COLOR, oldOffColor, offColor));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SYMBOL__OFF_COLOR, oldOffColor, offColor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getIcons()
  {
    if (icons == null)
    {
      icons = new EDataTypeEList<String>(String.class, this, TabletUIDSLPackage.SYMBOL__ICONS);
    }
    return icons;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Color> getOnColors()
  {
    if (onColors == null)
    {
      onColors = new EObjectResolvingEList<Color>(Color.class, this, TabletUIDSLPackage.SYMBOL__ON_COLORS);
    }
    return onColors;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Color> getOnBackgroundColors()
  {
    if (onBackgroundColors == null)
    {
      onBackgroundColors = new EObjectResolvingEList<Color>(Color.class, this, TabletUIDSLPackage.SYMBOL__ON_BACKGROUND_COLORS);
    }
    return onBackgroundColors;
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
      case TabletUIDSLPackage.SYMBOL__DEVICE:
        return getDevice();
      case TabletUIDSLPackage.SYMBOL__GET:
        return getGet();
      case TabletUIDSLPackage.SYMBOL__GET_ON:
        return getGetOn();
      case TabletUIDSLPackage.SYMBOL__GET_WARN:
        return getGetWarn();
      case TabletUIDSLPackage.SYMBOL__GET_OFF:
        return getGetOff();
      case TabletUIDSLPackage.SYMBOL__CLASS:
        return getClass_();
      case TabletUIDSLPackage.SYMBOL__BGICON:
        return getBgicon();
      case TabletUIDSLPackage.SYMBOL__OFF_COLOR:
        if (resolve) return getOffColor();
        return basicGetOffColor();
      case TabletUIDSLPackage.SYMBOL__ICONS:
        return getIcons();
      case TabletUIDSLPackage.SYMBOL__ON_COLORS:
        return getOnColors();
      case TabletUIDSLPackage.SYMBOL__ON_BACKGROUND_COLORS:
        return getOnBackgroundColors();
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
      case TabletUIDSLPackage.SYMBOL__DEVICE:
        setDevice((String)newValue);
        return;
      case TabletUIDSLPackage.SYMBOL__GET:
        setGet((String)newValue);
        return;
      case TabletUIDSLPackage.SYMBOL__GET_ON:
        getGetOn().clear();
        getGetOn().addAll((Collection<? extends String>)newValue);
        return;
      case TabletUIDSLPackage.SYMBOL__GET_WARN:
        setGetWarn((String)newValue);
        return;
      case TabletUIDSLPackage.SYMBOL__GET_OFF:
        getGetOff().clear();
        getGetOff().addAll((Collection<? extends String>)newValue);
        return;
      case TabletUIDSLPackage.SYMBOL__CLASS:
        setClass((String)newValue);
        return;
      case TabletUIDSLPackage.SYMBOL__BGICON:
        setBgicon((String)newValue);
        return;
      case TabletUIDSLPackage.SYMBOL__OFF_COLOR:
        setOffColor((Color)newValue);
        return;
      case TabletUIDSLPackage.SYMBOL__ICONS:
        getIcons().clear();
        getIcons().addAll((Collection<? extends String>)newValue);
        return;
      case TabletUIDSLPackage.SYMBOL__ON_COLORS:
        getOnColors().clear();
        getOnColors().addAll((Collection<? extends Color>)newValue);
        return;
      case TabletUIDSLPackage.SYMBOL__ON_BACKGROUND_COLORS:
        getOnBackgroundColors().clear();
        getOnBackgroundColors().addAll((Collection<? extends Color>)newValue);
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
      case TabletUIDSLPackage.SYMBOL__DEVICE:
        setDevice(DEVICE_EDEFAULT);
        return;
      case TabletUIDSLPackage.SYMBOL__GET:
        setGet(GET_EDEFAULT);
        return;
      case TabletUIDSLPackage.SYMBOL__GET_ON:
        getGetOn().clear();
        return;
      case TabletUIDSLPackage.SYMBOL__GET_WARN:
        setGetWarn(GET_WARN_EDEFAULT);
        return;
      case TabletUIDSLPackage.SYMBOL__GET_OFF:
        getGetOff().clear();
        return;
      case TabletUIDSLPackage.SYMBOL__CLASS:
        setClass(CLASS_EDEFAULT);
        return;
      case TabletUIDSLPackage.SYMBOL__BGICON:
        setBgicon(BGICON_EDEFAULT);
        return;
      case TabletUIDSLPackage.SYMBOL__OFF_COLOR:
        setOffColor((Color)null);
        return;
      case TabletUIDSLPackage.SYMBOL__ICONS:
        getIcons().clear();
        return;
      case TabletUIDSLPackage.SYMBOL__ON_COLORS:
        getOnColors().clear();
        return;
      case TabletUIDSLPackage.SYMBOL__ON_BACKGROUND_COLORS:
        getOnBackgroundColors().clear();
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
      case TabletUIDSLPackage.SYMBOL__DEVICE:
        return DEVICE_EDEFAULT == null ? device != null : !DEVICE_EDEFAULT.equals(device);
      case TabletUIDSLPackage.SYMBOL__GET:
        return GET_EDEFAULT == null ? get != null : !GET_EDEFAULT.equals(get);
      case TabletUIDSLPackage.SYMBOL__GET_ON:
        return getOn != null && !getOn.isEmpty();
      case TabletUIDSLPackage.SYMBOL__GET_WARN:
        return GET_WARN_EDEFAULT == null ? getWarn != null : !GET_WARN_EDEFAULT.equals(getWarn);
      case TabletUIDSLPackage.SYMBOL__GET_OFF:
        return getOff != null && !getOff.isEmpty();
      case TabletUIDSLPackage.SYMBOL__CLASS:
        return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
      case TabletUIDSLPackage.SYMBOL__BGICON:
        return BGICON_EDEFAULT == null ? bgicon != null : !BGICON_EDEFAULT.equals(bgicon);
      case TabletUIDSLPackage.SYMBOL__OFF_COLOR:
        return offColor != null;
      case TabletUIDSLPackage.SYMBOL__ICONS:
        return icons != null && !icons.isEmpty();
      case TabletUIDSLPackage.SYMBOL__ON_COLORS:
        return onColors != null && !onColors.isEmpty();
      case TabletUIDSLPackage.SYMBOL__ON_BACKGROUND_COLORS:
        return onBackgroundColors != null && !onBackgroundColors.isEmpty();
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
    result.append(", class: ");
    result.append(class_);
    result.append(", bgicon: ");
    result.append(bgicon);
    result.append(", icons: ");
    result.append(icons);
    result.append(')');
    return result.toString();
  }

} //SymbolImpl
