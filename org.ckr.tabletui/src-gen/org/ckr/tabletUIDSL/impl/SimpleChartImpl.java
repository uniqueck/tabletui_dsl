/**
 */
package org.ckr.tabletUIDSL.impl;

import org.ckr.tabletUIDSL.SimpleChart;
import org.ckr.tabletUIDSL.TabletUIDSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Simple Chart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SimpleChartImpl#getDevice <em>Device</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SimpleChartImpl#getLog_device <em>Log device</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SimpleChartImpl#getLogfile <em>Logfile</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SimpleChartImpl#getColumnSpec <em>Column Spec</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SimpleChartImpl#getMin <em>Min</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SimpleChartImpl#getMax <em>Max</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SimpleChartImpl#getXTicks <em>XTicks</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SimpleChartImpl#getYTicks <em>YTicks</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SimpleChartImpl#getDaysago <em>Daysago</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.SimpleChartImpl#getClass_ <em>Class</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SimpleChartImpl extends WidgetImpl implements SimpleChart
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
   * The default value of the '{@link #getLog_device() <em>Log device</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLog_device()
   * @generated
   * @ordered
   */
  protected static final String LOG_DEVICE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLog_device() <em>Log device</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLog_device()
   * @generated
   * @ordered
   */
  protected String log_device = LOG_DEVICE_EDEFAULT;

  /**
   * The default value of the '{@link #getLogfile() <em>Logfile</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLogfile()
   * @generated
   * @ordered
   */
  protected static final String LOGFILE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLogfile() <em>Logfile</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLogfile()
   * @generated
   * @ordered
   */
  protected String logfile = LOGFILE_EDEFAULT;

  /**
   * The default value of the '{@link #getColumnSpec() <em>Column Spec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumnSpec()
   * @generated
   * @ordered
   */
  protected static final String COLUMN_SPEC_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getColumnSpec() <em>Column Spec</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColumnSpec()
   * @generated
   * @ordered
   */
  protected String columnSpec = COLUMN_SPEC_EDEFAULT;

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
   * The default value of the '{@link #getXTicks() <em>XTicks</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXTicks()
   * @generated
   * @ordered
   */
  protected static final int XTICKS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getXTicks() <em>XTicks</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXTicks()
   * @generated
   * @ordered
   */
  protected int xTicks = XTICKS_EDEFAULT;

  /**
   * The default value of the '{@link #getYTicks() <em>YTicks</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYTicks()
   * @generated
   * @ordered
   */
  protected static final int YTICKS_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getYTicks() <em>YTicks</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYTicks()
   * @generated
   * @ordered
   */
  protected int yTicks = YTICKS_EDEFAULT;

  /**
   * The default value of the '{@link #getDaysago() <em>Daysago</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDaysago()
   * @generated
   * @ordered
   */
  protected static final int DAYSAGO_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getDaysago() <em>Daysago</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDaysago()
   * @generated
   * @ordered
   */
  protected int daysago = DAYSAGO_EDEFAULT;

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
  protected SimpleChartImpl()
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
    return TabletUIDSLPackage.Literals.SIMPLE_CHART;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SIMPLE_CHART__DEVICE, oldDevice, device));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLog_device()
  {
    return log_device;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLog_device(String newLog_device)
  {
    String oldLog_device = log_device;
    log_device = newLog_device;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SIMPLE_CHART__LOG_DEVICE, oldLog_device, log_device));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLogfile()
  {
    return logfile;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLogfile(String newLogfile)
  {
    String oldLogfile = logfile;
    logfile = newLogfile;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SIMPLE_CHART__LOGFILE, oldLogfile, logfile));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getColumnSpec()
  {
    return columnSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColumnSpec(String newColumnSpec)
  {
    String oldColumnSpec = columnSpec;
    columnSpec = newColumnSpec;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SIMPLE_CHART__COLUMN_SPEC, oldColumnSpec, columnSpec));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SIMPLE_CHART__MIN, oldMin, min));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SIMPLE_CHART__MAX, oldMax, max));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getXTicks()
  {
    return xTicks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setXTicks(int newXTicks)
  {
    int oldXTicks = xTicks;
    xTicks = newXTicks;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SIMPLE_CHART__XTICKS, oldXTicks, xTicks));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getYTicks()
  {
    return yTicks;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setYTicks(int newYTicks)
  {
    int oldYTicks = yTicks;
    yTicks = newYTicks;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SIMPLE_CHART__YTICKS, oldYTicks, yTicks));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getDaysago()
  {
    return daysago;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDaysago(int newDaysago)
  {
    int oldDaysago = daysago;
    daysago = newDaysago;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SIMPLE_CHART__DAYSAGO, oldDaysago, daysago));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.SIMPLE_CHART__CLASS, oldClass, class_));
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
      case TabletUIDSLPackage.SIMPLE_CHART__DEVICE:
        return getDevice();
      case TabletUIDSLPackage.SIMPLE_CHART__LOG_DEVICE:
        return getLog_device();
      case TabletUIDSLPackage.SIMPLE_CHART__LOGFILE:
        return getLogfile();
      case TabletUIDSLPackage.SIMPLE_CHART__COLUMN_SPEC:
        return getColumnSpec();
      case TabletUIDSLPackage.SIMPLE_CHART__MIN:
        return getMin();
      case TabletUIDSLPackage.SIMPLE_CHART__MAX:
        return getMax();
      case TabletUIDSLPackage.SIMPLE_CHART__XTICKS:
        return getXTicks();
      case TabletUIDSLPackage.SIMPLE_CHART__YTICKS:
        return getYTicks();
      case TabletUIDSLPackage.SIMPLE_CHART__DAYSAGO:
        return getDaysago();
      case TabletUIDSLPackage.SIMPLE_CHART__CLASS:
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
      case TabletUIDSLPackage.SIMPLE_CHART__DEVICE:
        setDevice((String)newValue);
        return;
      case TabletUIDSLPackage.SIMPLE_CHART__LOG_DEVICE:
        setLog_device((String)newValue);
        return;
      case TabletUIDSLPackage.SIMPLE_CHART__LOGFILE:
        setLogfile((String)newValue);
        return;
      case TabletUIDSLPackage.SIMPLE_CHART__COLUMN_SPEC:
        setColumnSpec((String)newValue);
        return;
      case TabletUIDSLPackage.SIMPLE_CHART__MIN:
        setMin((String)newValue);
        return;
      case TabletUIDSLPackage.SIMPLE_CHART__MAX:
        setMax((String)newValue);
        return;
      case TabletUIDSLPackage.SIMPLE_CHART__XTICKS:
        setXTicks((Integer)newValue);
        return;
      case TabletUIDSLPackage.SIMPLE_CHART__YTICKS:
        setYTicks((Integer)newValue);
        return;
      case TabletUIDSLPackage.SIMPLE_CHART__DAYSAGO:
        setDaysago((Integer)newValue);
        return;
      case TabletUIDSLPackage.SIMPLE_CHART__CLASS:
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
      case TabletUIDSLPackage.SIMPLE_CHART__DEVICE:
        setDevice(DEVICE_EDEFAULT);
        return;
      case TabletUIDSLPackage.SIMPLE_CHART__LOG_DEVICE:
        setLog_device(LOG_DEVICE_EDEFAULT);
        return;
      case TabletUIDSLPackage.SIMPLE_CHART__LOGFILE:
        setLogfile(LOGFILE_EDEFAULT);
        return;
      case TabletUIDSLPackage.SIMPLE_CHART__COLUMN_SPEC:
        setColumnSpec(COLUMN_SPEC_EDEFAULT);
        return;
      case TabletUIDSLPackage.SIMPLE_CHART__MIN:
        setMin(MIN_EDEFAULT);
        return;
      case TabletUIDSLPackage.SIMPLE_CHART__MAX:
        setMax(MAX_EDEFAULT);
        return;
      case TabletUIDSLPackage.SIMPLE_CHART__XTICKS:
        setXTicks(XTICKS_EDEFAULT);
        return;
      case TabletUIDSLPackage.SIMPLE_CHART__YTICKS:
        setYTicks(YTICKS_EDEFAULT);
        return;
      case TabletUIDSLPackage.SIMPLE_CHART__DAYSAGO:
        setDaysago(DAYSAGO_EDEFAULT);
        return;
      case TabletUIDSLPackage.SIMPLE_CHART__CLASS:
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
      case TabletUIDSLPackage.SIMPLE_CHART__DEVICE:
        return DEVICE_EDEFAULT == null ? device != null : !DEVICE_EDEFAULT.equals(device);
      case TabletUIDSLPackage.SIMPLE_CHART__LOG_DEVICE:
        return LOG_DEVICE_EDEFAULT == null ? log_device != null : !LOG_DEVICE_EDEFAULT.equals(log_device);
      case TabletUIDSLPackage.SIMPLE_CHART__LOGFILE:
        return LOGFILE_EDEFAULT == null ? logfile != null : !LOGFILE_EDEFAULT.equals(logfile);
      case TabletUIDSLPackage.SIMPLE_CHART__COLUMN_SPEC:
        return COLUMN_SPEC_EDEFAULT == null ? columnSpec != null : !COLUMN_SPEC_EDEFAULT.equals(columnSpec);
      case TabletUIDSLPackage.SIMPLE_CHART__MIN:
        return MIN_EDEFAULT == null ? min != null : !MIN_EDEFAULT.equals(min);
      case TabletUIDSLPackage.SIMPLE_CHART__MAX:
        return MAX_EDEFAULT == null ? max != null : !MAX_EDEFAULT.equals(max);
      case TabletUIDSLPackage.SIMPLE_CHART__XTICKS:
        return xTicks != XTICKS_EDEFAULT;
      case TabletUIDSLPackage.SIMPLE_CHART__YTICKS:
        return yTicks != YTICKS_EDEFAULT;
      case TabletUIDSLPackage.SIMPLE_CHART__DAYSAGO:
        return daysago != DAYSAGO_EDEFAULT;
      case TabletUIDSLPackage.SIMPLE_CHART__CLASS:
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
    result.append(", log_device: ");
    result.append(log_device);
    result.append(", logfile: ");
    result.append(logfile);
    result.append(", columnSpec: ");
    result.append(columnSpec);
    result.append(", min: ");
    result.append(min);
    result.append(", max: ");
    result.append(max);
    result.append(", xTicks: ");
    result.append(xTicks);
    result.append(", yTicks: ");
    result.append(yTicks);
    result.append(", daysago: ");
    result.append(daysago);
    result.append(", class: ");
    result.append(class_);
    result.append(')');
    return result.toString();
  }

} //SimpleChartImpl
