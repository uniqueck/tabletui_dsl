/**
 */
package org.ckr.tabletUIDSL.impl;

import org.ckr.tabletUIDSL.Color;
import org.ckr.tabletUIDSL.Link;
import org.ckr.tabletUIDSL.TabletUIDSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ckr.tabletUIDSL.impl.LinkImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.LinkImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.LinkImpl#getColor <em>Color</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.LinkImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.LinkImpl#getBackgroundColor <em>Background Color</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.LinkImpl#getIcon <em>Icon</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.LinkImpl#getCmd <em>Cmd</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.LinkImpl#getLabel <em>Label</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LinkImpl extends WidgetImpl implements Link
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
   * The cached value of the '{@link #getColor() <em>Color</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getColor()
   * @generated
   * @ordered
   */
  protected Color color;

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
   * The cached value of the '{@link #getBackgroundColor() <em>Background Color</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBackgroundColor()
   * @generated
   * @ordered
   */
  protected Color backgroundColor;

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
   * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected static final String LABEL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLabel()
   * @generated
   * @ordered
   */
  protected String label = LABEL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected LinkImpl()
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
    return TabletUIDSLPackage.Literals.LINK;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.LINK__WIDTH, oldWidth, width));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.LINK__HEIGHT, oldHeight, height));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getColor()
  {
    if (color != null && color.eIsProxy())
    {
      InternalEObject oldColor = (InternalEObject)color;
      color = (Color)eResolveProxy(oldColor);
      if (color != oldColor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TabletUIDSLPackage.LINK__COLOR, oldColor, color));
      }
    }
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color basicGetColor()
  {
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setColor(Color newColor)
  {
    Color oldColor = color;
    color = newColor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.LINK__COLOR, oldColor, color));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.LINK__CLASS, oldClass, class_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color getBackgroundColor()
  {
    if (backgroundColor != null && backgroundColor.eIsProxy())
    {
      InternalEObject oldBackgroundColor = (InternalEObject)backgroundColor;
      backgroundColor = (Color)eResolveProxy(oldBackgroundColor);
      if (backgroundColor != oldBackgroundColor)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TabletUIDSLPackage.LINK__BACKGROUND_COLOR, oldBackgroundColor, backgroundColor));
      }
    }
    return backgroundColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color basicGetBackgroundColor()
  {
    return backgroundColor;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setBackgroundColor(Color newBackgroundColor)
  {
    Color oldBackgroundColor = backgroundColor;
    backgroundColor = newBackgroundColor;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.LINK__BACKGROUND_COLOR, oldBackgroundColor, backgroundColor));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.LINK__ICON, oldIcon, icon));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.LINK__CMD, oldCmd, cmd));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLabel()
  {
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLabel(String newLabel)
  {
    String oldLabel = label;
    label = newLabel;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.LINK__LABEL, oldLabel, label));
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
      case TabletUIDSLPackage.LINK__WIDTH:
        return getWidth();
      case TabletUIDSLPackage.LINK__HEIGHT:
        return getHeight();
      case TabletUIDSLPackage.LINK__COLOR:
        if (resolve) return getColor();
        return basicGetColor();
      case TabletUIDSLPackage.LINK__CLASS:
        return getClass_();
      case TabletUIDSLPackage.LINK__BACKGROUND_COLOR:
        if (resolve) return getBackgroundColor();
        return basicGetBackgroundColor();
      case TabletUIDSLPackage.LINK__ICON:
        return getIcon();
      case TabletUIDSLPackage.LINK__CMD:
        return getCmd();
      case TabletUIDSLPackage.LINK__LABEL:
        return getLabel();
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
      case TabletUIDSLPackage.LINK__WIDTH:
        setWidth((String)newValue);
        return;
      case TabletUIDSLPackage.LINK__HEIGHT:
        setHeight((String)newValue);
        return;
      case TabletUIDSLPackage.LINK__COLOR:
        setColor((Color)newValue);
        return;
      case TabletUIDSLPackage.LINK__CLASS:
        setClass((String)newValue);
        return;
      case TabletUIDSLPackage.LINK__BACKGROUND_COLOR:
        setBackgroundColor((Color)newValue);
        return;
      case TabletUIDSLPackage.LINK__ICON:
        setIcon((String)newValue);
        return;
      case TabletUIDSLPackage.LINK__CMD:
        setCmd((String)newValue);
        return;
      case TabletUIDSLPackage.LINK__LABEL:
        setLabel((String)newValue);
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
      case TabletUIDSLPackage.LINK__WIDTH:
        setWidth(WIDTH_EDEFAULT);
        return;
      case TabletUIDSLPackage.LINK__HEIGHT:
        setHeight(HEIGHT_EDEFAULT);
        return;
      case TabletUIDSLPackage.LINK__COLOR:
        setColor((Color)null);
        return;
      case TabletUIDSLPackage.LINK__CLASS:
        setClass(CLASS_EDEFAULT);
        return;
      case TabletUIDSLPackage.LINK__BACKGROUND_COLOR:
        setBackgroundColor((Color)null);
        return;
      case TabletUIDSLPackage.LINK__ICON:
        setIcon(ICON_EDEFAULT);
        return;
      case TabletUIDSLPackage.LINK__CMD:
        setCmd(CMD_EDEFAULT);
        return;
      case TabletUIDSLPackage.LINK__LABEL:
        setLabel(LABEL_EDEFAULT);
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
      case TabletUIDSLPackage.LINK__WIDTH:
        return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
      case TabletUIDSLPackage.LINK__HEIGHT:
        return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
      case TabletUIDSLPackage.LINK__COLOR:
        return color != null;
      case TabletUIDSLPackage.LINK__CLASS:
        return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
      case TabletUIDSLPackage.LINK__BACKGROUND_COLOR:
        return backgroundColor != null;
      case TabletUIDSLPackage.LINK__ICON:
        return ICON_EDEFAULT == null ? icon != null : !ICON_EDEFAULT.equals(icon);
      case TabletUIDSLPackage.LINK__CMD:
        return CMD_EDEFAULT == null ? cmd != null : !CMD_EDEFAULT.equals(cmd);
      case TabletUIDSLPackage.LINK__LABEL:
        return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
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
    result.append(", class: ");
    result.append(class_);
    result.append(", icon: ");
    result.append(icon);
    result.append(", cmd: ");
    result.append(cmd);
    result.append(", label: ");
    result.append(label);
    result.append(')');
    return result.toString();
  }

} //LinkImpl
