/**
 */
package org.ckr.tabletUIDSL.impl;

import org.ckr.tabletUIDSL.Calview;
import org.ckr.tabletUIDSL.Color;
import org.ckr.tabletUIDSL.TabletUIDSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calview</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ckr.tabletUIDSL.impl.CalviewImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.CalviewImpl#getGet <em>Get</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.CalviewImpl#getMax <em>Max</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.CalviewImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.CalviewImpl#getAllFC <em>All FC</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.CalviewImpl#getAllTC <em>All TC</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalviewImpl extends WidgetImpl implements Calview
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
   * The default value of the '{@link #getMax() <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax()
   * @generated
   * @ordered
   */
  protected static final int MAX_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMax() <em>Max</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMax()
   * @generated
   * @ordered
   */
  protected int max = MAX_EDEFAULT;

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
   * The cached value of the '{@link #getAllFC() <em>All FC</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAllFC()
   * @generated
   * @ordered
   */
  protected Color allFC;

  /**
   * The cached value of the '{@link #getAllTC() <em>All TC</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAllTC()
   * @generated
   * @ordered
   */
  protected Color allTC;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CalviewImpl()
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
    return TabletUIDSLPackage.Literals.CALVIEW;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.CALVIEW__DEVICE, oldDevice, device));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.CALVIEW__GET, oldGet, get));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMax()
  {
    return max;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMax(int newMax)
  {
    int oldMax = max;
    max = newMax;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.CALVIEW__MAX, oldMax, max));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.CALVIEW__CLASS, oldClass, class_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getAllFC()
  {
    if (allFC != null && allFC.eIsProxy())
    {
      InternalEObject oldAllFC = (InternalEObject)allFC;
      allFC = (Color)eResolveProxy(oldAllFC);
      if (allFC != oldAllFC)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TabletUIDSLPackage.CALVIEW__ALL_FC, oldAllFC, allFC));
      }
    }
    return allFC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color basicGetAllFC()
  {
    return allFC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAllFC(Color newAllFC)
  {
    Color oldAllFC = allFC;
    allFC = newAllFC;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.CALVIEW__ALL_FC, oldAllFC, allFC));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getAllTC()
  {
    if (allTC != null && allTC.eIsProxy())
    {
      InternalEObject oldAllTC = (InternalEObject)allTC;
      allTC = (Color)eResolveProxy(oldAllTC);
      if (allTC != oldAllTC)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TabletUIDSLPackage.CALVIEW__ALL_TC, oldAllTC, allTC));
      }
    }
    return allTC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color basicGetAllTC()
  {
    return allTC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAllTC(Color newAllTC)
  {
    Color oldAllTC = allTC;
    allTC = newAllTC;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.CALVIEW__ALL_TC, oldAllTC, allTC));
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
      case TabletUIDSLPackage.CALVIEW__DEVICE:
        return getDevice();
      case TabletUIDSLPackage.CALVIEW__GET:
        return getGet();
      case TabletUIDSLPackage.CALVIEW__MAX:
        return getMax();
      case TabletUIDSLPackage.CALVIEW__CLASS:
        return getClass_();
      case TabletUIDSLPackage.CALVIEW__ALL_FC:
        if (resolve) return getAllFC();
        return basicGetAllFC();
      case TabletUIDSLPackage.CALVIEW__ALL_TC:
        if (resolve) return getAllTC();
        return basicGetAllTC();
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
      case TabletUIDSLPackage.CALVIEW__DEVICE:
        setDevice((String)newValue);
        return;
      case TabletUIDSLPackage.CALVIEW__GET:
        setGet((String)newValue);
        return;
      case TabletUIDSLPackage.CALVIEW__MAX:
        setMax((Integer)newValue);
        return;
      case TabletUIDSLPackage.CALVIEW__CLASS:
        setClass((String)newValue);
        return;
      case TabletUIDSLPackage.CALVIEW__ALL_FC:
        setAllFC((Color)newValue);
        return;
      case TabletUIDSLPackage.CALVIEW__ALL_TC:
        setAllTC((Color)newValue);
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
      case TabletUIDSLPackage.CALVIEW__DEVICE:
        setDevice(DEVICE_EDEFAULT);
        return;
      case TabletUIDSLPackage.CALVIEW__GET:
        setGet(GET_EDEFAULT);
        return;
      case TabletUIDSLPackage.CALVIEW__MAX:
        setMax(MAX_EDEFAULT);
        return;
      case TabletUIDSLPackage.CALVIEW__CLASS:
        setClass(CLASS_EDEFAULT);
        return;
      case TabletUIDSLPackage.CALVIEW__ALL_FC:
        setAllFC((Color)null);
        return;
      case TabletUIDSLPackage.CALVIEW__ALL_TC:
        setAllTC((Color)null);
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
      case TabletUIDSLPackage.CALVIEW__DEVICE:
        return DEVICE_EDEFAULT == null ? device != null : !DEVICE_EDEFAULT.equals(device);
      case TabletUIDSLPackage.CALVIEW__GET:
        return GET_EDEFAULT == null ? get != null : !GET_EDEFAULT.equals(get);
      case TabletUIDSLPackage.CALVIEW__MAX:
        return max != MAX_EDEFAULT;
      case TabletUIDSLPackage.CALVIEW__CLASS:
        return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
      case TabletUIDSLPackage.CALVIEW__ALL_FC:
        return allFC != null;
      case TabletUIDSLPackage.CALVIEW__ALL_TC:
        return allTC != null;
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
    result.append(", max: ");
    result.append(max);
    result.append(", class: ");
    result.append(class_);
    result.append(')');
    return result.toString();
  }

} //CalviewImpl
