/**
 */
package org.ckr.tabletUIDSL.impl;

import java.util.Collection;

import org.ckr.tabletUIDSL.Clock;
import org.ckr.tabletUIDSL.TabletUIDSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clock</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ckr.tabletUIDSL.impl.ClockImpl#getFormat <em>Format</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.ClockImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.ClockImpl#getStyle <em>Style</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.ClockImpl#getInterval <em>Interval</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.ClockImpl#getDays <em>Days</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.ClockImpl#getShortdayLength <em>Shortday Length</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.ClockImpl#getMonth <em>Month</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.ClockImpl#getMonthLength <em>Month Length</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClockImpl extends WidgetImpl implements Clock
{
  /**
   * The default value of the '{@link #getFormat() <em>Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormat()
   * @generated
   * @ordered
   */
  protected static final String FORMAT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFormat() <em>Format</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFormat()
   * @generated
   * @ordered
   */
  protected String format = FORMAT_EDEFAULT;

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
   * The default value of the '{@link #getInterval() <em>Interval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterval()
   * @generated
   * @ordered
   */
  protected static final int INTERVAL_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getInterval() <em>Interval</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getInterval()
   * @generated
   * @ordered
   */
  protected int interval = INTERVAL_EDEFAULT;

  /**
   * The cached value of the '{@link #getDays() <em>Days</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDays()
   * @generated
   * @ordered
   */
  protected EList<String> days;

  /**
   * The default value of the '{@link #getShortdayLength() <em>Shortday Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShortdayLength()
   * @generated
   * @ordered
   */
  protected static final int SHORTDAY_LENGTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getShortdayLength() <em>Shortday Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getShortdayLength()
   * @generated
   * @ordered
   */
  protected int shortdayLength = SHORTDAY_LENGTH_EDEFAULT;

  /**
   * The cached value of the '{@link #getMonth() <em>Month</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMonth()
   * @generated
   * @ordered
   */
  protected EList<String> month;

  /**
   * The default value of the '{@link #getMonthLength() <em>Month Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMonthLength()
   * @generated
   * @ordered
   */
  protected static final int MONTH_LENGTH_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMonthLength() <em>Month Length</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMonthLength()
   * @generated
   * @ordered
   */
  protected int monthLength = MONTH_LENGTH_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ClockImpl()
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
    return TabletUIDSLPackage.Literals.CLOCK;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFormat()
  {
    return format;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFormat(String newFormat)
  {
    String oldFormat = format;
    format = newFormat;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.CLOCK__FORMAT, oldFormat, format));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.CLOCK__CLASS, oldClass, class_));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.CLOCK__STYLE, oldStyle, style));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getInterval()
  {
    return interval;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setInterval(int newInterval)
  {
    int oldInterval = interval;
    interval = newInterval;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.CLOCK__INTERVAL, oldInterval, interval));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getDays()
  {
    if (days == null)
    {
      days = new EDataTypeEList<String>(String.class, this, TabletUIDSLPackage.CLOCK__DAYS);
    }
    return days;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getShortdayLength()
  {
    return shortdayLength;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setShortdayLength(int newShortdayLength)
  {
    int oldShortdayLength = shortdayLength;
    shortdayLength = newShortdayLength;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.CLOCK__SHORTDAY_LENGTH, oldShortdayLength, shortdayLength));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getMonth()
  {
    if (month == null)
    {
      month = new EDataTypeEList<String>(String.class, this, TabletUIDSLPackage.CLOCK__MONTH);
    }
    return month;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getMonthLength()
  {
    return monthLength;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMonthLength(int newMonthLength)
  {
    int oldMonthLength = monthLength;
    monthLength = newMonthLength;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.CLOCK__MONTH_LENGTH, oldMonthLength, monthLength));
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
      case TabletUIDSLPackage.CLOCK__FORMAT:
        return getFormat();
      case TabletUIDSLPackage.CLOCK__CLASS:
        return getClass_();
      case TabletUIDSLPackage.CLOCK__STYLE:
        return getStyle();
      case TabletUIDSLPackage.CLOCK__INTERVAL:
        return getInterval();
      case TabletUIDSLPackage.CLOCK__DAYS:
        return getDays();
      case TabletUIDSLPackage.CLOCK__SHORTDAY_LENGTH:
        return getShortdayLength();
      case TabletUIDSLPackage.CLOCK__MONTH:
        return getMonth();
      case TabletUIDSLPackage.CLOCK__MONTH_LENGTH:
        return getMonthLength();
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
      case TabletUIDSLPackage.CLOCK__FORMAT:
        setFormat((String)newValue);
        return;
      case TabletUIDSLPackage.CLOCK__CLASS:
        setClass((String)newValue);
        return;
      case TabletUIDSLPackage.CLOCK__STYLE:
        setStyle((String)newValue);
        return;
      case TabletUIDSLPackage.CLOCK__INTERVAL:
        setInterval((Integer)newValue);
        return;
      case TabletUIDSLPackage.CLOCK__DAYS:
        getDays().clear();
        getDays().addAll((Collection<? extends String>)newValue);
        return;
      case TabletUIDSLPackage.CLOCK__SHORTDAY_LENGTH:
        setShortdayLength((Integer)newValue);
        return;
      case TabletUIDSLPackage.CLOCK__MONTH:
        getMonth().clear();
        getMonth().addAll((Collection<? extends String>)newValue);
        return;
      case TabletUIDSLPackage.CLOCK__MONTH_LENGTH:
        setMonthLength((Integer)newValue);
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
      case TabletUIDSLPackage.CLOCK__FORMAT:
        setFormat(FORMAT_EDEFAULT);
        return;
      case TabletUIDSLPackage.CLOCK__CLASS:
        setClass(CLASS_EDEFAULT);
        return;
      case TabletUIDSLPackage.CLOCK__STYLE:
        setStyle(STYLE_EDEFAULT);
        return;
      case TabletUIDSLPackage.CLOCK__INTERVAL:
        setInterval(INTERVAL_EDEFAULT);
        return;
      case TabletUIDSLPackage.CLOCK__DAYS:
        getDays().clear();
        return;
      case TabletUIDSLPackage.CLOCK__SHORTDAY_LENGTH:
        setShortdayLength(SHORTDAY_LENGTH_EDEFAULT);
        return;
      case TabletUIDSLPackage.CLOCK__MONTH:
        getMonth().clear();
        return;
      case TabletUIDSLPackage.CLOCK__MONTH_LENGTH:
        setMonthLength(MONTH_LENGTH_EDEFAULT);
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
      case TabletUIDSLPackage.CLOCK__FORMAT:
        return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
      case TabletUIDSLPackage.CLOCK__CLASS:
        return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
      case TabletUIDSLPackage.CLOCK__STYLE:
        return STYLE_EDEFAULT == null ? style != null : !STYLE_EDEFAULT.equals(style);
      case TabletUIDSLPackage.CLOCK__INTERVAL:
        return interval != INTERVAL_EDEFAULT;
      case TabletUIDSLPackage.CLOCK__DAYS:
        return days != null && !days.isEmpty();
      case TabletUIDSLPackage.CLOCK__SHORTDAY_LENGTH:
        return shortdayLength != SHORTDAY_LENGTH_EDEFAULT;
      case TabletUIDSLPackage.CLOCK__MONTH:
        return month != null && !month.isEmpty();
      case TabletUIDSLPackage.CLOCK__MONTH_LENGTH:
        return monthLength != MONTH_LENGTH_EDEFAULT;
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
    result.append(" (format: ");
    result.append(format);
    result.append(", class: ");
    result.append(class_);
    result.append(", style: ");
    result.append(style);
    result.append(", interval: ");
    result.append(interval);
    result.append(", days: ");
    result.append(days);
    result.append(", shortdayLength: ");
    result.append(shortdayLength);
    result.append(", month: ");
    result.append(month);
    result.append(", monthLength: ");
    result.append(monthLength);
    result.append(')');
    return result.toString();
  }

} //ClockImpl
