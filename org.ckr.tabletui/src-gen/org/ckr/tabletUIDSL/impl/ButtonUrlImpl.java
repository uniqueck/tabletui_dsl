/**
 */
package org.ckr.tabletUIDSL.impl;

import org.ckr.tabletUIDSL.ButtonUrl;
import org.ckr.tabletUIDSL.Page;
import org.ckr.tabletUIDSL.TabletUIDSLPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Button Url</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.ckr.tabletUIDSL.impl.ButtonUrlImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.ButtonUrlImpl#getPage <em>Page</em>}</li>
 *   <li>{@link org.ckr.tabletUIDSL.impl.ButtonUrlImpl#getFhemCmd <em>Fhem Cmd</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ButtonUrlImpl extends MinimalEObjectImpl.Container implements ButtonUrl
{
  /**
   * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
  protected static final String URL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
  protected String url = URL_EDEFAULT;

  /**
   * The cached value of the '{@link #getPage() <em>Page</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPage()
   * @generated
   * @ordered
   */
  protected Page page;

  /**
   * The default value of the '{@link #getFhemCmd() <em>Fhem Cmd</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFhemCmd()
   * @generated
   * @ordered
   */
  protected static final String FHEM_CMD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFhemCmd() <em>Fhem Cmd</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFhemCmd()
   * @generated
   * @ordered
   */
  protected String fhemCmd = FHEM_CMD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ButtonUrlImpl()
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
    return TabletUIDSLPackage.Literals.BUTTON_URL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUrl()
  {
    return url;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUrl(String newUrl)
  {
    String oldUrl = url;
    url = newUrl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.BUTTON_URL__URL, oldUrl, url));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Page getPage()
  {
    if (page != null && page.eIsProxy())
    {
      InternalEObject oldPage = (InternalEObject)page;
      page = (Page)eResolveProxy(oldPage);
      if (page != oldPage)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, TabletUIDSLPackage.BUTTON_URL__PAGE, oldPage, page));
      }
    }
    return page;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Page basicGetPage()
  {
    return page;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPage(Page newPage)
  {
    Page oldPage = page;
    page = newPage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.BUTTON_URL__PAGE, oldPage, page));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFhemCmd()
  {
    return fhemCmd;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFhemCmd(String newFhemCmd)
  {
    String oldFhemCmd = fhemCmd;
    fhemCmd = newFhemCmd;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, TabletUIDSLPackage.BUTTON_URL__FHEM_CMD, oldFhemCmd, fhemCmd));
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
      case TabletUIDSLPackage.BUTTON_URL__URL:
        return getUrl();
      case TabletUIDSLPackage.BUTTON_URL__PAGE:
        if (resolve) return getPage();
        return basicGetPage();
      case TabletUIDSLPackage.BUTTON_URL__FHEM_CMD:
        return getFhemCmd();
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
      case TabletUIDSLPackage.BUTTON_URL__URL:
        setUrl((String)newValue);
        return;
      case TabletUIDSLPackage.BUTTON_URL__PAGE:
        setPage((Page)newValue);
        return;
      case TabletUIDSLPackage.BUTTON_URL__FHEM_CMD:
        setFhemCmd((String)newValue);
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
      case TabletUIDSLPackage.BUTTON_URL__URL:
        setUrl(URL_EDEFAULT);
        return;
      case TabletUIDSLPackage.BUTTON_URL__PAGE:
        setPage((Page)null);
        return;
      case TabletUIDSLPackage.BUTTON_URL__FHEM_CMD:
        setFhemCmd(FHEM_CMD_EDEFAULT);
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
      case TabletUIDSLPackage.BUTTON_URL__URL:
        return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
      case TabletUIDSLPackage.BUTTON_URL__PAGE:
        return page != null;
      case TabletUIDSLPackage.BUTTON_URL__FHEM_CMD:
        return FHEM_CMD_EDEFAULT == null ? fhemCmd != null : !FHEM_CMD_EDEFAULT.equals(fhemCmd);
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
    result.append(" (url: ");
    result.append(url);
    result.append(", fhemCmd: ");
    result.append(fhemCmd);
    result.append(')');
    return result.toString();
  }

} //ButtonUrlImpl
