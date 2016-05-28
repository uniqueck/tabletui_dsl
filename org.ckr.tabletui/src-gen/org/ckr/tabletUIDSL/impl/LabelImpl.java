/**
 */
package org.ckr.tabletUIDSL.impl;

import org.ckr.tabletUIDSL.Label;
import org.ckr.tabletUIDSL.TabletUIDSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Label</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ckr.tabletUIDSL.impl.LabelImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.LabelImpl#getGet <em>Get</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.LabelImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.LabelImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.LabelImpl#getUnit <em>Unit</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.LabelImpl#getPart <em>Part</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.LabelImpl#getSubstitution <em>Substitution</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LabelImpl extends WidgetImpl implements Label
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
   * The default value of the '{@link #getStyle() <em>Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyle()
   * @generated
   * @ordered
   */
  protected static final String STYLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStyle() <em>Style</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStyle()
   * @generated
   * @ordered
   */
  protected String style = STYLE_EDEFAULT;

  /**
   * The default value of the '{@link #getUnit() <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnit()
   * @generated
   * @ordered
   */
  protected static final String UNIT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUnit() <em>Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnit()
   * @generated
   * @ordered
   */
  protected String unit = UNIT_EDEFAULT;

  /**
   * The default value of the '{@link #getPart() <em>Part</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPart()
   * @generated
   * @ordered
   */
  protected static final String PART_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getPart() <em>Part</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPart()
   * @generated
   * @ordered
   */
  protected String part = PART_EDEFAULT;

  /**
   * The default value of the '{@link #getSubstitution() <em>Substitution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubstitution()
   * @generated
   * @ordered
   */
  protected static final String SUBSTITUTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSubstitution() <em>Substitution</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubstitution()
   * @generated
   * @ordered
   */
  protected String substitution = SUBSTITUTION_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LabelImpl()
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
    return TabletUIDSLPackage.Literals.LABEL;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.LABEL__DEVICE, oldDevice, device));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.LABEL__GET, oldGet, get));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.LABEL__CLASS, oldClass, class_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStyle()
  {
    return style;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStyle(String newStyle)
  {
    String oldStyle = style;
    style = newStyle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.LABEL__STYLE, oldStyle, style));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUnit()
  {
    return unit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnit(String newUnit)
  {
    String oldUnit = unit;
    unit = newUnit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.LABEL__UNIT, oldUnit, unit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getPart()
  {
    return part;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPart(String newPart)
  {
    String oldPart = part;
    part = newPart;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.LABEL__PART, oldPart, part));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSubstitution()
  {
    return substitution;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSubstitution(String newSubstitution)
  {
    String oldSubstitution = substitution;
    substitution = newSubstitution;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.LABEL__SUBSTITUTION, oldSubstitution, substitution));
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
      case TabletUIDSLPackage.LABEL__DEVICE:
        return getDevice();
      case TabletUIDSLPackage.LABEL__GET:
        return getGet();
      case TabletUIDSLPackage.LABEL__CLASS:
        return getClass_();
      case TabletUIDSLPackage.LABEL__STYLE:
        return getStyle();
      case TabletUIDSLPackage.LABEL__UNIT:
        return getUnit();
      case TabletUIDSLPackage.LABEL__PART:
        return getPart();
      case TabletUIDSLPackage.LABEL__SUBSTITUTION:
        return getSubstitution();
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
      case TabletUIDSLPackage.LABEL__DEVICE:
        setDevice((String)newValue);
        return;
      case TabletUIDSLPackage.LABEL__GET:
        setGet((String)newValue);
        return;
      case TabletUIDSLPackage.LABEL__CLASS:
        setClass((String)newValue);
        return;
      case TabletUIDSLPackage.LABEL__STYLE:
        setStyle((String)newValue);
        return;
      case TabletUIDSLPackage.LABEL__UNIT:
        setUnit((String)newValue);
        return;
      case TabletUIDSLPackage.LABEL__PART:
        setPart((String)newValue);
        return;
      case TabletUIDSLPackage.LABEL__SUBSTITUTION:
        setSubstitution((String)newValue);
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
      case TabletUIDSLPackage.LABEL__DEVICE:
        setDevice(DEVICE_EDEFAULT);
        return;
      case TabletUIDSLPackage.LABEL__GET:
        setGet(GET_EDEFAULT);
        return;
      case TabletUIDSLPackage.LABEL__CLASS:
        setClass(CLASS_EDEFAULT);
        return;
      case TabletUIDSLPackage.LABEL__STYLE:
        setStyle(STYLE_EDEFAULT);
        return;
      case TabletUIDSLPackage.LABEL__UNIT:
        setUnit(UNIT_EDEFAULT);
        return;
      case TabletUIDSLPackage.LABEL__PART:
        setPart(PART_EDEFAULT);
        return;
      case TabletUIDSLPackage.LABEL__SUBSTITUTION:
        setSubstitution(SUBSTITUTION_EDEFAULT);
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
      case TabletUIDSLPackage.LABEL__DEVICE:
        return DEVICE_EDEFAULT == null ? device != null : !DEVICE_EDEFAULT.equals(device);
      case TabletUIDSLPackage.LABEL__GET:
        return GET_EDEFAULT == null ? get != null : !GET_EDEFAULT.equals(get);
      case TabletUIDSLPackage.LABEL__CLASS:
        return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
      case TabletUIDSLPackage.LABEL__STYLE:
        return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
      case TabletUIDSLPackage.LABEL__UNIT:
        return UNIT_EDEFAULT == null ? unit != null : !UNIT_EDEFAULT.equals(unit);
      case TabletUIDSLPackage.LABEL__PART:
        return PART_EDEFAULT == null ? part != null : !PART_EDEFAULT.equals(part);
      case TabletUIDSLPackage.LABEL__SUBSTITUTION:
        return SUBSTITUTION_EDEFAULT == null ? substitution != null : !SUBSTITUTION_EDEFAULT.equals(substitution);
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
    result.append(", style: ");
    result.append(style);
    result.append(", unit: ");
    result.append(unit);
    result.append(", part: ");
    result.append(part);
    result.append(", substitution: ");
    result.append(substitution);
    result.append(')');
    return result.toString();
  }

} //LabelImpl
