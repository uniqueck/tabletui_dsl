/**
 */
package org.ckr.tabletUIDSL.impl;

import java.util.Collection;

import org.ckr.tabletUIDSL.TabletUIDSLPackage;
import org.ckr.tabletUIDSL.itunes_artwork;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>itunes artwork</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ckr.tabletUIDSL.impl.itunes_artworkImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.itunes_artworkImpl#getGet <em>Get</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.itunes_artworkImpl#getOpacity <em>Opacity</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.itunes_artworkImpl#getSize <em>Size</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.itunes_artworkImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.itunes_artworkImpl#getStyle <em>Style</em>}</li>
 * </ul>
 *
 * @generated
 */
public class itunes_artworkImpl extends WidgetImpl implements itunes_artwork
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
   * The cached value of the '{@link #getGet() <em>Get</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGet()
   * @generated
   * @ordered
   */
  protected EList<String> get;

  /**
   * The default value of the '{@link #getOpacity() <em>Opacity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpacity()
   * @generated
   * @ordered
   */
  protected static final String OPACITY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOpacity() <em>Opacity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpacity()
   * @generated
   * @ordered
   */
  protected String opacity = OPACITY_EDEFAULT;

  /**
   * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected static final String SIZE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize()
   * @generated
   * @ordered
   */
  protected String size = SIZE_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected itunes_artworkImpl()
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
    return TabletUIDSLPackage.Literals.ITUNES_ARTWORK;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.ITUNES_ARTWORK__DEVICE, oldDevice, device));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getGet()
  {
    if (get == null)
    {
      get = new EDataTypeEList<String>(String.class, this, TabletUIDSLPackage.ITUNES_ARTWORK__GET);
    }
    return get;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOpacity()
  {
    return opacity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpacity(String newOpacity)
  {
    String oldOpacity = opacity;
    opacity = newOpacity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.ITUNES_ARTWORK__OPACITY, oldOpacity, opacity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getSize()
  {
    return size;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSize(String newSize)
  {
    String oldSize = size;
    size = newSize;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.ITUNES_ARTWORK__SIZE, oldSize, size));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.ITUNES_ARTWORK__CLASS, oldClass, class_));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.ITUNES_ARTWORK__STYLE, oldStyle, style));
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
      case TabletUIDSLPackage.ITUNES_ARTWORK__DEVICE:
        return getDevice();
      case TabletUIDSLPackage.ITUNES_ARTWORK__GET:
        return getGet();
      case TabletUIDSLPackage.ITUNES_ARTWORK__OPACITY:
        return getOpacity();
      case TabletUIDSLPackage.ITUNES_ARTWORK__SIZE:
        return getSize();
      case TabletUIDSLPackage.ITUNES_ARTWORK__CLASS:
        return getClass_();
      case TabletUIDSLPackage.ITUNES_ARTWORK__STYLE:
        return getStyle();
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
      case TabletUIDSLPackage.ITUNES_ARTWORK__DEVICE:
        setDevice((String)newValue);
        return;
      case TabletUIDSLPackage.ITUNES_ARTWORK__GET:
        getGet().clear();
        getGet().addAll((Collection<? extends String>)newValue);
        return;
      case TabletUIDSLPackage.ITUNES_ARTWORK__OPACITY:
        setOpacity((String)newValue);
        return;
      case TabletUIDSLPackage.ITUNES_ARTWORK__SIZE:
        setSize((String)newValue);
        return;
      case TabletUIDSLPackage.ITUNES_ARTWORK__CLASS:
        setClass((String)newValue);
        return;
      case TabletUIDSLPackage.ITUNES_ARTWORK__STYLE:
        setStyle((String)newValue);
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
      case TabletUIDSLPackage.ITUNES_ARTWORK__DEVICE:
        setDevice(DEVICE_EDEFAULT);
        return;
      case TabletUIDSLPackage.ITUNES_ARTWORK__GET:
        getGet().clear();
        return;
      case TabletUIDSLPackage.ITUNES_ARTWORK__OPACITY:
        setOpacity(OPACITY_EDEFAULT);
        return;
      case TabletUIDSLPackage.ITUNES_ARTWORK__SIZE:
        setSize(SIZE_EDEFAULT);
        return;
      case TabletUIDSLPackage.ITUNES_ARTWORK__CLASS:
        setClass(CLASS_EDEFAULT);
        return;
      case TabletUIDSLPackage.ITUNES_ARTWORK__STYLE:
        setStyle(STYLE_EDEFAULT);
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
      case TabletUIDSLPackage.ITUNES_ARTWORK__DEVICE:
        return DEVICE_EDEFAULT == null ? device != null : !DEVICE_EDEFAULT.equals(device);
      case TabletUIDSLPackage.ITUNES_ARTWORK__GET:
        return get != null && !get.isEmpty();
      case TabletUIDSLPackage.ITUNES_ARTWORK__OPACITY:
        return OPACITY_EDEFAULT == null ? opacity != null : !OPACITY_EDEFAULT.equals(opacity);
      case TabletUIDSLPackage.ITUNES_ARTWORK__SIZE:
        return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
      case TabletUIDSLPackage.ITUNES_ARTWORK__CLASS:
        return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
      case TabletUIDSLPackage.ITUNES_ARTWORK__STYLE:
        return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
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
    result.append(", opacity: ");
    result.append(opacity);
    result.append(", size: ");
    result.append(size);
    result.append(", class: ");
    result.append(class_);
    result.append(", style: ");
    result.append(style);
    result.append(')');
    return result.toString();
  }

} //itunes_artworkImpl
