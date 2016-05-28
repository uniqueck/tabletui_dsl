/**
 */
package org.ckr.tabletUIDSL.impl;

import org.ckr.tabletUIDSL.TabletUIDSLPackage;
import org.ckr.tabletUIDSL.Volume;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Volume</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ckr.tabletUIDSL.impl.VolumeImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.VolumeImpl#getGet <em>Get</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.VolumeImpl#getSet <em>Set</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.VolumeImpl#getCmd <em>Cmd</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.VolumeImpl#getMin <em>Min</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.VolumeImpl#getMax <em>Max</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.VolumeImpl#getClass_ <em>Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class VolumeImpl extends WidgetImpl implements Volume
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
   * The default value of the '{@link #getMin() <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMin()
   * @generated
   * @ordered
   */
  protected static final String MIN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMin() <em>Min</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMin()
   * @generated
   * @ordered
   */
  protected String min = MIN_EDEFAULT;

  /**
   * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax()
   * @generated
   * @ordered
   */
  protected static final String MAX_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax()
   * @generated
   * @ordered
   */
  protected String max = MAX_EDEFAULT;

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
  protected VolumeImpl()
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
    return TabletUIDSLPackage.Literals.VOLUME;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.VOLUME__DEVICE, oldDevice, device));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.VOLUME__GET, oldGet, get));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.VOLUME__SET, oldSet, set));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.VOLUME__CMD, oldCmd, cmd));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMin()
  {
    return min;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMin(String newMin)
  {
    String oldMin = min;
    min = newMin;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.VOLUME__MIN, oldMin, min));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMax()
  {
    return max;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMax(String newMax)
  {
    String oldMax = max;
    max = newMax;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.VOLUME__MAX, oldMax, max));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.VOLUME__CLASS, oldClass, class_));
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
      case TabletUIDSLPackage.VOLUME__DEVICE:
        return getDevice();
      case TabletUIDSLPackage.VOLUME__GET:
        return getGet();
      case TabletUIDSLPackage.VOLUME__SET:
        return getSet();
      case TabletUIDSLPackage.VOLUME__CMD:
        return getCmd();
      case TabletUIDSLPackage.VOLUME__MIN:
        return getMin();
      case TabletUIDSLPackage.VOLUME__MAX:
        return getMax();
      case TabletUIDSLPackage.VOLUME__CLASS:
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
      case TabletUIDSLPackage.VOLUME__DEVICE:
        setDevice((String)newValue);
        return;
      case TabletUIDSLPackage.VOLUME__GET:
        setGet((String)newValue);
        return;
      case TabletUIDSLPackage.VOLUME__SET:
        setSet((String)newValue);
        return;
      case TabletUIDSLPackage.VOLUME__CMD:
        setCmd((String)newValue);
        return;
      case TabletUIDSLPackage.VOLUME__MIN:
        setMin((String)newValue);
        return;
      case TabletUIDSLPackage.VOLUME__MAX:
        setMax((String)newValue);
        return;
      case TabletUIDSLPackage.VOLUME__CLASS:
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
      case TabletUIDSLPackage.VOLUME__DEVICE:
        setDevice(DEVICE_EDEFAULT);
        return;
      case TabletUIDSLPackage.VOLUME__GET:
        setGet(GET_EDEFAULT);
        return;
      case TabletUIDSLPackage.VOLUME__SET:
        setSet(SET_EDEFAULT);
        return;
      case TabletUIDSLPackage.VOLUME__CMD:
        setCmd(CMD_EDEFAULT);
        return;
      case TabletUIDSLPackage.VOLUME__MIN:
        setMin(MIN_EDEFAULT);
        return;
      case TabletUIDSLPackage.VOLUME__MAX:
        setMax(MAX_EDEFAULT);
        return;
      case TabletUIDSLPackage.VOLUME__CLASS:
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
      case TabletUIDSLPackage.VOLUME__DEVICE:
        return DEVICE_EDEFAULT == null ? device != null : !DEVICE_EDEFAULT.equals(device);
      case TabletUIDSLPackage.VOLUME__GET:
        return GET_EDEFAULT == null ? get != null : !GET_EDEFAULT.equals(get);
      case TabletUIDSLPackage.VOLUME__SET:
        return SET_EDEFAULT == null ? set != null : !SET_EDEFAULT.equals(set);
      case TabletUIDSLPackage.VOLUME__CMD:
        return CMD_EDEFAULT == null ? cmd != null : !CMD_EDEFAULT.equals(cmd);
      case TabletUIDSLPackage.VOLUME__MIN:
        return MIN_EDEFAULT == null ? min != null : !MIN_EDEFAULT.equals(min);
      case TabletUIDSLPackage.VOLUME__MAX:
        return MAX_EDEFAULT == null ? max != null : !MAX_EDEFAULT.equals(max);
      case TabletUIDSLPackage.VOLUME__CLASS:
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
    result.append(", get: ");
    result.append(get);
    result.append(", set: ");
    result.append(set);
    result.append(", cmd: ");
    result.append(cmd);
    result.append(", min: ");
    result.append(min);
    result.append(", max: ");
    result.append(max);
    result.append(", class: ");
    result.append(class_);
    result.append(')');
    return result.toString();
  }

} //VolumeImpl
