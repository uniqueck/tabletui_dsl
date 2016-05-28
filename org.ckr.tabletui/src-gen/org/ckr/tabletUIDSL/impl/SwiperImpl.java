/**
 */
package org.ckr.tabletUIDSL.impl;

import java.util.Collection;

import org.ckr.tabletUIDSL.Div;
import org.ckr.tabletUIDSL.Swiper;
import org.ckr.tabletUIDSL.TabletUIDSLPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Swiper</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SwiperImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SwiperImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SwiperImpl#getAutoplay <em>Autoplay</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SwiperImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SwiperImpl#getDivs <em>Divs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwiperImpl extends WidgetImpl implements Swiper
{
  /**
   * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidth()
   * @generated
   * @ordered
   */
  protected static final String WIDTH_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidth()
   * @generated
   * @ordered
   */
  protected String width = WIDTH_EDEFAULT;

  /**
   * The default value of the '{@link #getHeight() <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeight()
   * @generated
   * @ordered
   */
  protected static final String HEIGHT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHeight() <em>Height</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeight()
   * @generated
   * @ordered
   */
  protected String height = HEIGHT_EDEFAULT;

  /**
   * The default value of the '{@link #getAutoplay() <em>Autoplay</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAutoplay()
   * @generated
   * @ordered
   */
  protected static final int AUTOPLAY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getAutoplay() <em>Autoplay</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAutoplay()
   * @generated
   * @ordered
   */
  protected int autoplay = AUTOPLAY_EDEFAULT;

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
   * The cached value of the '{@link #getDivs() <em>Divs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDivs()
   * @generated
   * @ordered
   */
  protected EList<Div> divs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SwiperImpl()
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
    return TabletUIDSLPackage.Literals.SWIPER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getWidth()
  {
    return width;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setWidth(String newWidth)
  {
    String oldWidth = width;
    width = newWidth;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SWIPER__WIDTH, oldWidth, width));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHeight()
  {
    return height;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeight(String newHeight)
  {
    String oldHeight = height;
    height = newHeight;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SWIPER__HEIGHT, oldHeight, height));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getAutoplay()
  {
    return autoplay;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAutoplay(int newAutoplay)
  {
    int oldAutoplay = autoplay;
    autoplay = newAutoplay;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SWIPER__AUTOPLAY, oldAutoplay, autoplay));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SWIPER__CLASS, oldClass, class_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Div> getDivs()
  {
    if (divs == null)
    {
      divs = new EObjectContainmentEList<Div>(Div.class, this, TabletUIDSLPackage.SWIPER__DIVS);
    }
    return divs;
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
      case TabletUIDSLPackage.SWIPER__DIVS:
        return ((InternalEList<?>)getDivs()).basicRemove(otherEnd, msgs);
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
      case TabletUIDSLPackage.SWIPER__WIDTH:
        return getWidth();
      case TabletUIDSLPackage.SWIPER__HEIGHT:
        return getHeight();
      case TabletUIDSLPackage.SWIPER__AUTOPLAY:
        return getAutoplay();
      case TabletUIDSLPackage.SWIPER__CLASS:
        return getClass_();
      case TabletUIDSLPackage.SWIPER__DIVS:
        return getDivs();
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
      case TabletUIDSLPackage.SWIPER__WIDTH:
        setWidth((String)newValue);
        return;
      case TabletUIDSLPackage.SWIPER__HEIGHT:
        setHeight((String)newValue);
        return;
      case TabletUIDSLPackage.SWIPER__AUTOPLAY:
        setAutoplay((Integer)newValue);
        return;
      case TabletUIDSLPackage.SWIPER__CLASS:
        setClass((String)newValue);
        return;
      case TabletUIDSLPackage.SWIPER__DIVS:
        getDivs().clear();
        getDivs().addAll((Collection<? extends Div>)newValue);
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
      case TabletUIDSLPackage.SWIPER__WIDTH:
        setWidth(WIDTH_EDEFAULT);
        return;
      case TabletUIDSLPackage.SWIPER__HEIGHT:
        setHeight(HEIGHT_EDEFAULT);
        return;
      case TabletUIDSLPackage.SWIPER__AUTOPLAY:
        setAutoplay(AUTOPLAY_EDEFAULT);
        return;
      case TabletUIDSLPackage.SWIPER__CLASS:
        setClass(CLASS_EDEFAULT);
        return;
      case TabletUIDSLPackage.SWIPER__DIVS:
        getDivs().clear();
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
      case TabletUIDSLPackage.SWIPER__WIDTH:
        return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
      case TabletUIDSLPackage.SWIPER__HEIGHT:
        return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
      case TabletUIDSLPackage.SWIPER__AUTOPLAY:
        return autoplay != AUTOPLAY_EDEFAULT;
      case TabletUIDSLPackage.SWIPER__CLASS:
        return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
      case TabletUIDSLPackage.SWIPER__DIVS:
        return divs != null && !divs.isEmpty();
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
    result.append(" (width: ");
    result.append(width);
    result.append(", height: ");
    result.append(height);
    result.append(", autoplay: ");
    result.append(autoplay);
    result.append(", class: ");
    result.append(class_);
    result.append(')');
    return result.toString();
  }

} //SwiperImpl
