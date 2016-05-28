/**
 */
package org.ckr.tabletUIDSL.impl;

import java.util.Collection;

import org.ckr.tabletUIDSL.Popup;
import org.ckr.tabletUIDSL.TabletUIDSLPackage;
import org.ckr.tabletUIDSL.Widget;

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
 * An implementation of the model object '<em><b>Popup</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ckr.tabletUIDSL.impl.PopupImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.PopupImpl#getHeight <em>Height</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.PopupImpl#getOpenIcon <em>Open Icon</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.PopupImpl#getOpenBackgroundIcon <em>Open Background Icon</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.PopupImpl#getOpenClass <em>Open Class</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.PopupImpl#getDialogClass <em>Dialog Class</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.PopupImpl#getDialogHeaderClass <em>Dialog Header Class</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.PopupImpl#getHeader <em>Header</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.PopupImpl#getWidgets <em>Widgets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PopupImpl extends WidgetImpl implements Popup
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
   * The default value of the '{@link #getOpenIcon() <em>Open Icon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpenIcon()
   * @generated
   * @ordered
   */
  protected static final String OPEN_ICON_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOpenIcon() <em>Open Icon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpenIcon()
   * @generated
   * @ordered
   */
  protected String openIcon = OPEN_ICON_EDEFAULT;

  /**
   * The default value of the '{@link #getOpenBackgroundIcon() <em>Open Background Icon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpenBackgroundIcon()
   * @generated
   * @ordered
   */
  protected static final String OPEN_BACKGROUND_ICON_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOpenBackgroundIcon() <em>Open Background Icon</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpenBackgroundIcon()
   * @generated
   * @ordered
   */
  protected String openBackgroundIcon = OPEN_BACKGROUND_ICON_EDEFAULT;

  /**
   * The default value of the '{@link #getOpenClass() <em>Open Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpenClass()
   * @generated
   * @ordered
   */
  protected static final String OPEN_CLASS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOpenClass() <em>Open Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOpenClass()
   * @generated
   * @ordered
   */
  protected String openClass = OPEN_CLASS_EDEFAULT;

  /**
   * The default value of the '{@link #getDialogClass() <em>Dialog Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDialogClass()
   * @generated
   * @ordered
   */
  protected static final String DIALOG_CLASS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDialogClass() <em>Dialog Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDialogClass()
   * @generated
   * @ordered
   */
  protected String dialogClass = DIALOG_CLASS_EDEFAULT;

  /**
   * The default value of the '{@link #getDialogHeaderClass() <em>Dialog Header Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDialogHeaderClass()
   * @generated
   * @ordered
   */
  protected static final String DIALOG_HEADER_CLASS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDialogHeaderClass() <em>Dialog Header Class</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDialogHeaderClass()
   * @generated
   * @ordered
   */
  protected String dialogHeaderClass = DIALOG_HEADER_CLASS_EDEFAULT;

  /**
   * The default value of the '{@link #getHeader() <em>Header</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeader()
   * @generated
   * @ordered
   */
  protected static final String HEADER_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHeader() <em>Header</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeader()
   * @generated
   * @ordered
   */
  protected String header = HEADER_EDEFAULT;

  /**
   * The cached value of the '{@link #getWidgets() <em>Widgets</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getWidgets()
   * @generated
   * @ordered
   */
  protected EList<Widget> widgets;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PopupImpl()
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
    return TabletUIDSLPackage.Literals.POPUP;
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.POPUP__WIDTH, oldWidth, width));
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
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.POPUP__HEIGHT, oldHeight, height));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOpenIcon()
  {
    return openIcon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpenIcon(String newOpenIcon)
  {
    String oldOpenIcon = openIcon;
    openIcon = newOpenIcon;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.POPUP__OPEN_ICON, oldOpenIcon, openIcon));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOpenBackgroundIcon()
  {
    return openBackgroundIcon;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpenBackgroundIcon(String newOpenBackgroundIcon)
  {
    String oldOpenBackgroundIcon = openBackgroundIcon;
    openBackgroundIcon = newOpenBackgroundIcon;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.POPUP__OPEN_BACKGROUND_ICON, oldOpenBackgroundIcon, openBackgroundIcon));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getOpenClass()
  {
    return openClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setOpenClass(String newOpenClass)
  {
    String oldOpenClass = openClass;
    openClass = newOpenClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.POPUP__OPEN_CLASS, oldOpenClass, openClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDialogClass()
  {
    return dialogClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDialogClass(String newDialogClass)
  {
    String oldDialogClass = dialogClass;
    dialogClass = newDialogClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.POPUP__DIALOG_CLASS, oldDialogClass, dialogClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDialogHeaderClass()
  {
    return dialogHeaderClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDialogHeaderClass(String newDialogHeaderClass)
  {
    String oldDialogHeaderClass = dialogHeaderClass;
    dialogHeaderClass = newDialogHeaderClass;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.POPUP__DIALOG_HEADER_CLASS, oldDialogHeaderClass, dialogHeaderClass));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getHeader()
  {
    return header;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setHeader(String newHeader)
  {
    String oldHeader = header;
    header = newHeader;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.POPUP__HEADER, oldHeader, header));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Widget> getWidgets()
  {
    if (widgets == null)
    {
      widgets = new EObjectContainmentEList<Widget>(Widget.class, this, TabletUIDSLPackage.POPUP__WIDGETS);
    }
    return widgets;
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
      case TabletUIDSLPackage.POPUP__WIDGETS:
        return ((InternalEList<?>)getWidgets()).basicRemove(otherEnd, msgs);
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
      case TabletUIDSLPackage.POPUP__WIDTH:
        return getWidth();
      case TabletUIDSLPackage.POPUP__HEIGHT:
        return getHeight();
      case TabletUIDSLPackage.POPUP__OPEN_ICON:
        return getOpenIcon();
      case TabletUIDSLPackage.POPUP__OPEN_BACKGROUND_ICON:
        return getOpenBackgroundIcon();
      case TabletUIDSLPackage.POPUP__OPEN_CLASS:
        return getOpenClass();
      case TabletUIDSLPackage.POPUP__DIALOG_CLASS:
        return getDialogClass();
      case TabletUIDSLPackage.POPUP__DIALOG_HEADER_CLASS:
        return getDialogHeaderClass();
      case TabletUIDSLPackage.POPUP__HEADER:
        return getHeader();
      case TabletUIDSLPackage.POPUP__WIDGETS:
        return getWidgets();
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
      case TabletUIDSLPackage.POPUP__WIDTH:
        setWidth((String)newValue);
        return;
      case TabletUIDSLPackage.POPUP__HEIGHT:
        setHeight((String)newValue);
        return;
      case TabletUIDSLPackage.POPUP__OPEN_ICON:
        setOpenIcon((String)newValue);
        return;
      case TabletUIDSLPackage.POPUP__OPEN_BACKGROUND_ICON:
        setOpenBackgroundIcon((String)newValue);
        return;
      case TabletUIDSLPackage.POPUP__OPEN_CLASS:
        setOpenClass((String)newValue);
        return;
      case TabletUIDSLPackage.POPUP__DIALOG_CLASS:
        setDialogClass((String)newValue);
        return;
      case TabletUIDSLPackage.POPUP__DIALOG_HEADER_CLASS:
        setDialogHeaderClass((String)newValue);
        return;
      case TabletUIDSLPackage.POPUP__HEADER:
        setHeader((String)newValue);
        return;
      case TabletUIDSLPackage.POPUP__WIDGETS:
        getWidgets().clear();
        getWidgets().addAll((Collection<? extends Widget>)newValue);
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
      case TabletUIDSLPackage.POPUP__WIDTH:
        setWidth(WIDTH_EDEFAULT);
        return;
      case TabletUIDSLPackage.POPUP__HEIGHT:
        setHeight(HEIGHT_EDEFAULT);
        return;
      case TabletUIDSLPackage.POPUP__OPEN_ICON:
        setOpenIcon(OPEN_ICON_EDEFAULT);
        return;
      case TabletUIDSLPackage.POPUP__OPEN_BACKGROUND_ICON:
        setOpenBackgroundIcon(OPEN_BACKGROUND_ICON_EDEFAULT);
        return;
      case TabletUIDSLPackage.POPUP__OPEN_CLASS:
        setOpenClass(OPEN_CLASS_EDEFAULT);
        return;
      case TabletUIDSLPackage.POPUP__DIALOG_CLASS:
        setDialogClass(DIALOG_CLASS_EDEFAULT);
        return;
      case TabletUIDSLPackage.POPUP__DIALOG_HEADER_CLASS:
        setDialogHeaderClass(DIALOG_HEADER_CLASS_EDEFAULT);
        return;
      case TabletUIDSLPackage.POPUP__HEADER:
        setHeader(HEADER_EDEFAULT);
        return;
      case TabletUIDSLPackage.POPUP__WIDGETS:
        getWidgets().clear();
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
      case TabletUIDSLPackage.POPUP__WIDTH:
        return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
      case TabletUIDSLPackage.POPUP__HEIGHT:
        return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
      case TabletUIDSLPackage.POPUP__OPEN_ICON:
        return OPEN_ICON_EDEFAULT == null ? openIcon != null : !OPEN_ICON_EDEFAULT.equals(openIcon);
      case TabletUIDSLPackage.POPUP__OPEN_BACKGROUND_ICON:
        return OPEN_BACKGROUND_ICON_EDEFAULT == null ? openBackgroundIcon != null : !OPEN_BACKGROUND_ICON_EDEFAULT.equals(openBackgroundIcon);
      case TabletUIDSLPackage.POPUP__OPEN_CLASS:
        return OPEN_CLASS_EDEFAULT == null ? openClass != null : !OPEN_CLASS_EDEFAULT.equals(openClass);
      case TabletUIDSLPackage.POPUP__DIALOG_CLASS:
        return DIALOG_CLASS_EDEFAULT == null ? dialogClass != null : !DIALOG_CLASS_EDEFAULT.equals(dialogClass);
      case TabletUIDSLPackage.POPUP__DIALOG_HEADER_CLASS:
        return DIALOG_HEADER_CLASS_EDEFAULT == null ? dialogHeaderClass != null : !DIALOG_HEADER_CLASS_EDEFAULT.equals(dialogHeaderClass);
      case TabletUIDSLPackage.POPUP__HEADER:
        return HEADER_EDEFAULT == null ? header != null : !HEADER_EDEFAULT.equals(header);
      case TabletUIDSLPackage.POPUP__WIDGETS:
        return widgets != null && !widgets.isEmpty();
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
    result.append(", openIcon: ");
    result.append(openIcon);
    result.append(", openBackgroundIcon: ");
    result.append(openBackgroundIcon);
    result.append(", openClass: ");
    result.append(openClass);
    result.append(", dialogClass: ");
    result.append(dialogClass);
    result.append(", dialogHeaderClass: ");
    result.append(dialogHeaderClass);
    result.append(", header: ");
    result.append(header);
    result.append(')');
    return result.toString();
  }

} //PopupImpl
