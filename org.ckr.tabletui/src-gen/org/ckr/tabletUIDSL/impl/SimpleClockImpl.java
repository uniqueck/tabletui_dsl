/**
 */
package org.ckr.tabletUIDSL.impl;

import java.util.Collection;

import org.ckr.tabletUIDSL.Color;
import org.ckr.tabletUIDSL.SimpleClock;
import org.ckr.tabletUIDSL.TabletUIDSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Clock</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SimpleClockImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SimpleClockImpl#getDateFormat <em>Date Format</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SimpleClockImpl#getTimeFormat <em>Time Format</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SimpleClockImpl#getDateColor <em>Date Color</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SimpleClockImpl#getTimeColor <em>Time Color</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SimpleClockImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SimpleClockImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SimpleClockImpl#getBgColors <em>Bg Colors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleClockImpl extends WidgetImpl implements SimpleClock
{
  /**
   * The default value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected static final String ID_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getId()
   * @generated
   * @ordered
   */
  protected String id = ID_EDEFAULT;

  /**
   * The default value of the '{@link #getDateFormat() <em>Date Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDateFormat()
   * @generated
   * @ordered
   */
  protected static final String DATE_FORMAT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDateFormat() <em>Date Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDateFormat()
   * @generated
   * @ordered
   */
  protected String dateFormat = DATE_FORMAT_EDEFAULT;

  /**
   * The default value of the '{@link #getTimeFormat() <em>Time Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimeFormat()
   * @generated
   * @ordered
   */
  protected static final String TIME_FORMAT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTimeFormat() <em>Time Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimeFormat()
   * @generated
   * @ordered
   */
  protected String timeFormat = TIME_FORMAT_EDEFAULT;

  /**
   * The cached value of the '{@link #getDateColor() <em>Date Color</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDateColor()
   * @generated
   * @ordered
   */
  protected Color dateColor;

  /**
   * The cached value of the '{@link #getTimeColor() <em>Time Color</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimeColor()
   * @generated
   * @ordered
   */
  protected Color timeColor;

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
   * The cached value of the '{@link #getBgColors() <em>Bg Colors</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBgColors()
   * @generated
   * @ordered
   */
  protected EList<Color> bgColors;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected SimpleClockImpl()
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
    return TabletUIDSLPackage.Literals.SIMPLE_CLOCK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getId()
  {
    return id;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setId(String newId)
  {
    String oldId = id;
    id = newId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SIMPLE_CLOCK__ID, oldId, id));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDateFormat()
  {
    return dateFormat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDateFormat(String newDateFormat)
  {
    String oldDateFormat = dateFormat;
    dateFormat = newDateFormat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SIMPLE_CLOCK__DATE_FORMAT, oldDateFormat, dateFormat));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTimeFormat()
  {
    return timeFormat;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTimeFormat(String newTimeFormat)
  {
    String oldTimeFormat = timeFormat;
    timeFormat = newTimeFormat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SIMPLE_CLOCK__TIME_FORMAT, oldTimeFormat, timeFormat));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getDateColor()
  {
    if (dateColor != null && dateColor.eIsProxy())
    {
      InternalEObject oldDateColor = (InternalEObject)dateColor;
      dateColor = (Color)eResolveProxy(oldDateColor);
      if (dateColor != oldDateColor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TabletUIDSLPackage.SIMPLE_CLOCK__DATE_COLOR, oldDateColor, dateColor));
      }
    }
    return dateColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color basicGetDateColor()
  {
    return dateColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDateColor(Color newDateColor)
  {
    Color oldDateColor = dateColor;
    dateColor = newDateColor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SIMPLE_CLOCK__DATE_COLOR, oldDateColor, dateColor));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getTimeColor()
  {
    if (timeColor != null && timeColor.eIsProxy())
    {
      InternalEObject oldTimeColor = (InternalEObject)timeColor;
      timeColor = (Color)eResolveProxy(oldTimeColor);
      if (timeColor != oldTimeColor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TabletUIDSLPackage.SIMPLE_CLOCK__TIME_COLOR, oldTimeColor, timeColor));
      }
    }
    return timeColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color basicGetTimeColor()
  {
    return timeColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTimeColor(Color newTimeColor)
  {
    Color oldTimeColor = timeColor;
    timeColor = newTimeColor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SIMPLE_CLOCK__TIME_COLOR, oldTimeColor, timeColor));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SIMPLE_CLOCK__CLASS, oldClass, class_));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SIMPLE_CLOCK__STYLE, oldStyle, style));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Color> getBgColors()
  {
    if (bgColors == null)
    {
      bgColors = new EObjectResolvingEList<Color>(Color.class, this, TabletUIDSLPackage.SIMPLE_CLOCK__BG_COLORS);
    }
    return bgColors;
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
      case TabletUIDSLPackage.SIMPLE_CLOCK__ID:
        return getId();
      case TabletUIDSLPackage.SIMPLE_CLOCK__DATE_FORMAT:
        return getDateFormat();
      case TabletUIDSLPackage.SIMPLE_CLOCK__TIME_FORMAT:
        return getTimeFormat();
      case TabletUIDSLPackage.SIMPLE_CLOCK__DATE_COLOR:
        if (resolve) return getDateColor();
        return basicGetDateColor();
      case TabletUIDSLPackage.SIMPLE_CLOCK__TIME_COLOR:
        if (resolve) return getTimeColor();
        return basicGetTimeColor();
      case TabletUIDSLPackage.SIMPLE_CLOCK__CLASS:
        return getClass_();
      case TabletUIDSLPackage.SIMPLE_CLOCK__STYLE:
        return getStyle();
      case TabletUIDSLPackage.SIMPLE_CLOCK__BG_COLORS:
        return getBgColors();
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
      case TabletUIDSLPackage.SIMPLE_CLOCK__ID:
        setId((String)newValue);
        return;
      case TabletUIDSLPackage.SIMPLE_CLOCK__DATE_FORMAT:
        setDateFormat((String)newValue);
        return;
      case TabletUIDSLPackage.SIMPLE_CLOCK__TIME_FORMAT:
        setTimeFormat((String)newValue);
        return;
      case TabletUIDSLPackage.SIMPLE_CLOCK__DATE_COLOR:
        setDateColor((Color)newValue);
        return;
      case TabletUIDSLPackage.SIMPLE_CLOCK__TIME_COLOR:
        setTimeColor((Color)newValue);
        return;
      case TabletUIDSLPackage.SIMPLE_CLOCK__CLASS:
        setClass((String)newValue);
        return;
      case TabletUIDSLPackage.SIMPLE_CLOCK__STYLE:
        setStyle((String)newValue);
        return;
      case TabletUIDSLPackage.SIMPLE_CLOCK__BG_COLORS:
        getBgColors().clear();
        getBgColors().addAll((Collection<? extends Color>)newValue);
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
      case TabletUIDSLPackage.SIMPLE_CLOCK__ID:
        setId(ID_EDEFAULT);
        return;
      case TabletUIDSLPackage.SIMPLE_CLOCK__DATE_FORMAT:
        setDateFormat(DATE_FORMAT_EDEFAULT);
        return;
      case TabletUIDSLPackage.SIMPLE_CLOCK__TIME_FORMAT:
        setTimeFormat(TIME_FORMAT_EDEFAULT);
        return;
      case TabletUIDSLPackage.SIMPLE_CLOCK__DATE_COLOR:
        setDateColor((Color)null);
        return;
      case TabletUIDSLPackage.SIMPLE_CLOCK__TIME_COLOR:
        setTimeColor((Color)null);
        return;
      case TabletUIDSLPackage.SIMPLE_CLOCK__CLASS:
        setClass(CLASS_EDEFAULT);
        return;
      case TabletUIDSLPackage.SIMPLE_CLOCK__STYLE:
        setStyle(STYLE_EDEFAULT);
        return;
      case TabletUIDSLPackage.SIMPLE_CLOCK__BG_COLORS:
        getBgColors().clear();
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
      case TabletUIDSLPackage.SIMPLE_CLOCK__ID:
        return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
      case TabletUIDSLPackage.SIMPLE_CLOCK__DATE_FORMAT:
        return DATE_FORMAT_EDEFAULT == null ? dateFormat != null : !DATE_FORMAT_EDEFAULT.equals(dateFormat);
      case TabletUIDSLPackage.SIMPLE_CLOCK__TIME_FORMAT:
        return TIME_FORMAT_EDEFAULT == null ? timeFormat != null : !TIME_FORMAT_EDEFAULT.equals(timeFormat);
      case TabletUIDSLPackage.SIMPLE_CLOCK__DATE_COLOR:
        return dateColor != null;
      case TabletUIDSLPackage.SIMPLE_CLOCK__TIME_COLOR:
        return timeColor != null;
      case TabletUIDSLPackage.SIMPLE_CLOCK__CLASS:
        return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
      case TabletUIDSLPackage.SIMPLE_CLOCK__STYLE:
        return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
      case TabletUIDSLPackage.SIMPLE_CLOCK__BG_COLORS:
        return bgColors != null && !bgColors.isEmpty();
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
    result.append(" (id: ");
    result.append(id);
    result.append(", dateFormat: ");
    result.append(dateFormat);
    result.append(", timeFormat: ");
    result.append(timeFormat);
    result.append(", class: ");
    result.append(class_);
    result.append(", style: ");
    result.append(style);
    result.append(')');
    return result.toString();
  }

} //SimpleClockImpl
