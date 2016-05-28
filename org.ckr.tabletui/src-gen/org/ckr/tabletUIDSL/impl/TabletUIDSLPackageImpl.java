/**
 */
package org.ckr.tabletUIDSL.impl;

import org.ckr.tabletUIDSL.AbstractElement;
import org.ckr.tabletUIDSL.Button;
import org.ckr.tabletUIDSL.ButtonUrl;
import org.ckr.tabletUIDSL.Calview;
import org.ckr.tabletUIDSL.Clock;
import org.ckr.tabletUIDSL.Color;
import org.ckr.tabletUIDSL.Custom;
import org.ckr.tabletUIDSL.Div;
import org.ckr.tabletUIDSL.Gridster;
import org.ckr.tabletUIDSL.Image;
import org.ckr.tabletUIDSL.Klimatrend;
import org.ckr.tabletUIDSL.Label;
import org.ckr.tabletUIDSL.Link;
import org.ckr.tabletUIDSL.Page;
import org.ckr.tabletUIDSL.Popup;
import org.ckr.tabletUIDSL.Push;
import org.ckr.tabletUIDSL.Screensaver;
import org.ckr.tabletUIDSL.Select;
import org.ckr.tabletUIDSL.Settings;
import org.ckr.tabletUIDSL.SettingsElement;
import org.ckr.tabletUIDSL.SimpleChart;
import org.ckr.tabletUIDSL.SimpleClock;
import org.ckr.tabletUIDSL.Swiper;
import org.ckr.tabletUIDSL.Switch;
import org.ckr.tabletUIDSL.Symbol;
import org.ckr.tabletUIDSL.TabletUI;
import org.ckr.tabletUIDSL.TabletUIDSLFactory;
import org.ckr.tabletUIDSL.TabletUIDSLPackage;
import org.ckr.tabletUIDSL.Template;
import org.ckr.tabletUIDSL.TemplateRef;
import org.ckr.tabletUIDSL.Volume;
import org.ckr.tabletUIDSL.Weather;
import org.ckr.tabletUIDSL.Widget;
import org.ckr.tabletUIDSL.WidgetDef;
import org.ckr.tabletUIDSL.itunes_artwork;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TabletUIDSLPackageImpl extends EPackageImpl implements TabletUIDSLPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass tabletUIEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass settingsEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass settingsElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass cssEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass abstractElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass screensaverEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass templateEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass gridsterEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass widgetDefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass widgetEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass clockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass swiperEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass templateRefEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass selectEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass volumeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass pushEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass imageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass switchEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass customEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass divEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass itunes_artworkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass weatherEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass calviewEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass popupEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass linkEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass buttonUrlEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass buttonEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass klimatrendEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass symbolEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleClockEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass simpleChartEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass colorEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass labelEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see org.ckr.tabletUIDSL.TabletUIDSLPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private TabletUIDSLPackageImpl()
  {
    super(eNS_URI, TabletUIDSLFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link TabletUIDSLPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static TabletUIDSLPackage init()
  {
    if (isInited) return (TabletUIDSLPackage)EPackage.Registry.INSTANCE.getEPackage(TabletUIDSLPackage.eNS_URI);

    // Obtain or create and register package
    TabletUIDSLPackageImpl theTabletUIDSLPackage = (TabletUIDSLPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TabletUIDSLPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TabletUIDSLPackageImpl());

    isInited = true;

    // Create package meta-data objects
    theTabletUIDSLPackage.createPackageContents();

    // Initialize created meta-data
    theTabletUIDSLPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theTabletUIDSLPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(TabletUIDSLPackage.eNS_URI, theTabletUIDSLPackage);
    return theTabletUIDSLPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTabletUI()
  {
    return tabletUIEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTabletUI_Settings()
  {
    return (EReference)tabletUIEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTabletUI_Elements()
  {
    return (EReference)tabletUIEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSettings()
  {
    return settingsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSettings_Title()
  {
    return (EAttribute)settingsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSettings_Fhemweb_url()
  {
    return (EAttribute)settingsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSettings_Width()
  {
    return (EAttribute)settingsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSettings_Height()
  {
    return (EAttribute)settingsEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSettings_Columns()
  {
    return (EAttribute)settingsEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSettings_Rows()
  {
    return (EAttribute)settingsEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSettings_Debug()
  {
    return (EAttribute)settingsEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSettings_Dragdrop()
  {
    return (EAttribute)settingsEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSettings_Margin()
  {
    return (EAttribute)settingsEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSettings_Settings()
  {
    return (EReference)settingsEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSettingsElement()
  {
    return settingsElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCSS()
  {
    return cssEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCSS_Path()
  {
    return (EAttribute)cssEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAbstractElement()
  {
    return abstractElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAbstractElement_Name()
  {
    return (EAttribute)abstractElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPage()
  {
    return pageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPage_Screensaver()
  {
    return (EReference)pageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPage_Elements()
  {
    return (EReference)pageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getScreensaver()
  {
    return screensaverEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getScreensaver_Widgets()
  {
    return (EReference)screensaverEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTemplate()
  {
    return templateEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplate_Elements()
  {
    return (EReference)templateEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGridster()
  {
    return gridsterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGridster_Header()
  {
    return (EAttribute)gridsterEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGridster_Row()
  {
    return (EAttribute)gridsterEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGridster_Column()
  {
    return (EAttribute)gridsterEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGridster_Colspan()
  {
    return (EAttribute)gridsterEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGridster_Rowspan()
  {
    return (EAttribute)gridsterEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGridster_Class()
  {
    return (EAttribute)gridsterEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGridster_Style()
  {
    return (EAttribute)gridsterEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGridster_Colors()
  {
    return (EReference)gridsterEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGridster_Widgets()
  {
    return (EReference)gridsterEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWidgetDef()
  {
    return widgetDefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWidget()
  {
    return widgetEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getClock()
  {
    return clockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClock_Format()
  {
    return (EAttribute)clockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClock_Class()
  {
    return (EAttribute)clockEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClock_Style()
  {
    return (EAttribute)clockEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClock_Interval()
  {
    return (EAttribute)clockEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClock_Days()
  {
    return (EAttribute)clockEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClock_ShortdayLength()
  {
    return (EAttribute)clockEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClock_Month()
  {
    return (EAttribute)clockEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getClock_MonthLength()
  {
    return (EAttribute)clockEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSwiper()
  {
    return swiperEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSwiper_Width()
  {
    return (EAttribute)swiperEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSwiper_Height()
  {
    return (EAttribute)swiperEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSwiper_Autoplay()
  {
    return (EAttribute)swiperEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSwiper_Class()
  {
    return (EAttribute)swiperEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSwiper_Divs()
  {
    return (EReference)swiperEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getTemplateRef()
  {
    return templateRefEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getTemplateRef_Template()
  {
    return (EReference)templateRefEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSelect()
  {
    return selectEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelect_Device()
  {
    return (EAttribute)selectEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelect_List()
  {
    return (EAttribute)selectEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelect_Items()
  {
    return (EAttribute)selectEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelect_Alias()
  {
    return (EAttribute)selectEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelect_Cmd()
  {
    return (EAttribute)selectEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelect_Quote()
  {
    return (EAttribute)selectEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelect_Get()
  {
    return (EAttribute)selectEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelect_Set()
  {
    return (EAttribute)selectEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSelect_Class()
  {
    return (EAttribute)selectEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVolume()
  {
    return volumeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVolume_Device()
  {
    return (EAttribute)volumeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVolume_Get()
  {
    return (EAttribute)volumeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVolume_Set()
  {
    return (EAttribute)volumeEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVolume_Cmd()
  {
    return (EAttribute)volumeEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVolume_Min()
  {
    return (EAttribute)volumeEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVolume_Max()
  {
    return (EAttribute)volumeEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVolume_Class()
  {
    return (EAttribute)volumeEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPush()
  {
    return pushEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPush_Device()
  {
    return (EAttribute)pushEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPush_DataSet()
  {
    return (EAttribute)pushEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPush_SetOn()
  {
    return (EAttribute)pushEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPush_Icon()
  {
    return (EAttribute)pushEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPush_BackgroundIcon()
  {
    return (EAttribute)pushEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPush_Cmd()
  {
    return (EAttribute)pushEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPush_DoubleClick()
  {
    return (EAttribute)pushEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPush_Countdown()
  {
    return (EAttribute)pushEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPush_Class()
  {
    return (EAttribute)pushEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPush_Url()
  {
    return (EAttribute)pushEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getImage()
  {
    return imageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImage_Device()
  {
    return (EAttribute)imageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImage_Get()
  {
    return (EAttribute)imageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImage_Size()
  {
    return (EAttribute)imageEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getImage_Class()
  {
    return (EAttribute)imageEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSwitch()
  {
    return switchEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSwitch_Device()
  {
    return (EAttribute)switchEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSwitch_Get()
  {
    return (EAttribute)switchEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSwitch_GetOn()
  {
    return (EAttribute)switchEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSwitch_SetOn()
  {
    return (EAttribute)switchEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSwitch_GetOff()
  {
    return (EAttribute)switchEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSwitch_Class()
  {
    return (EAttribute)switchEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSwitch_OnColor()
  {
    return (EReference)switchEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSwitch_OffColor()
  {
    return (EReference)switchEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSwitch_OnBackGroundColor()
  {
    return (EReference)switchEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSwitch_BackgroundIcon()
  {
    return (EAttribute)switchEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSwitch_Icon()
  {
    return (EAttribute)switchEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCustom()
  {
    return customEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCustom_Code()
  {
    return (EAttribute)customEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDiv()
  {
    return divEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDiv_Class()
  {
    return (EAttribute)divEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDiv_Style()
  {
    return (EAttribute)divEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDiv_Widgets()
  {
    return (EReference)divEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getitunes_artwork()
  {
    return itunes_artworkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getitunes_artwork_Device()
  {
    return (EAttribute)itunes_artworkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getitunes_artwork_Get()
  {
    return (EAttribute)itunes_artworkEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getitunes_artwork_Opacity()
  {
    return (EAttribute)itunes_artworkEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getitunes_artwork_Size()
  {
    return (EAttribute)itunes_artworkEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getitunes_artwork_Class()
  {
    return (EAttribute)itunes_artworkEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getitunes_artwork_Style()
  {
    return (EAttribute)itunes_artworkEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getWeather()
  {
    return weatherEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeather_Device()
  {
    return (EAttribute)weatherEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeather_Get()
  {
    return (EAttribute)weatherEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeather_Class()
  {
    return (EAttribute)weatherEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeather_Imageset()
  {
    return (EAttribute)weatherEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getWeather_ImagePath()
  {
    return (EAttribute)weatherEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCalview()
  {
    return calviewEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCalview_Device()
  {
    return (EAttribute)calviewEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCalview_Get()
  {
    return (EAttribute)calviewEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCalview_Max()
  {
    return (EAttribute)calviewEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getCalview_Class()
  {
    return (EAttribute)calviewEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCalview_AllFC()
  {
    return (EReference)calviewEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCalview_AllTC()
  {
    return (EReference)calviewEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPopup()
  {
    return popupEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPopup_Width()
  {
    return (EAttribute)popupEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPopup_Height()
  {
    return (EAttribute)popupEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPopup_OpenIcon()
  {
    return (EAttribute)popupEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPopup_OpenBackgroundIcon()
  {
    return (EAttribute)popupEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPopup_OpenClass()
  {
    return (EAttribute)popupEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPopup_DialogClass()
  {
    return (EAttribute)popupEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPopup_DialogHeaderClass()
  {
    return (EAttribute)popupEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getPopup_Header()
  {
    return (EAttribute)popupEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getPopup_Widgets()
  {
    return (EReference)popupEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLink()
  {
    return linkEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLink_Width()
  {
    return (EAttribute)linkEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLink_Height()
  {
    return (EAttribute)linkEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLink_Color()
  {
    return (EReference)linkEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLink_Class()
  {
    return (EAttribute)linkEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getLink_BackgroundColor()
  {
    return (EReference)linkEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLink_Icon()
  {
    return (EAttribute)linkEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLink_Cmd()
  {
    return (EAttribute)linkEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLink_Label()
  {
    return (EAttribute)linkEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getButtonUrl()
  {
    return buttonUrlEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getButtonUrl_Url()
  {
    return (EAttribute)buttonUrlEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getButtonUrl_Page()
  {
    return (EReference)buttonUrlEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getButtonUrl_FhemCmd()
  {
    return (EAttribute)buttonUrlEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getButton()
  {
    return buttonEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getButton_Device()
  {
    return (EAttribute)buttonEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getButton_Get()
  {
    return (EAttribute)buttonEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getButton_GetOn()
  {
    return (EAttribute)buttonEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getButton_GetWarn()
  {
    return (EAttribute)buttonEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getButton_GetOff()
  {
    return (EAttribute)buttonEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getButton_Target()
  {
    return (EReference)buttonEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getButton_Icon()
  {
    return (EAttribute)buttonEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getButton_BackgroundIcon()
  {
    return (EAttribute)buttonEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getButton_Class()
  {
    return (EAttribute)buttonEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getButton_OnColor()
  {
    return (EReference)buttonEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getButton_OnBackgroundColor()
  {
    return (EReference)buttonEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getButton_OffColor()
  {
    return (EReference)buttonEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getButton_OffBackgroundColor()
  {
    return (EReference)buttonEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getKlimatrend()
  {
    return klimatrendEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKlimatrend_Device()
  {
    return (EAttribute)klimatrendEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKlimatrend_Get()
  {
    return (EAttribute)klimatrendEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKlimatrend_Class()
  {
    return (EAttribute)klimatrendEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKlimatrend_Refperiod()
  {
    return (EAttribute)klimatrendEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKlimatrend_StagnatingColor()
  {
    return (EReference)klimatrendEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKlimatrend_Icon()
  {
    return (EAttribute)klimatrendEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKlimatrend_RisingColor()
  {
    return (EReference)klimatrendEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKlimatrend_FallingColor()
  {
    return (EReference)klimatrendEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKlimatrend_Highmark()
  {
    return (EAttribute)klimatrendEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getKlimatrend_HighmarkIcon()
  {
    return (EAttribute)klimatrendEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKlimatrend_HighmarkRisingColor()
  {
    return (EReference)klimatrendEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getKlimatrend_HighmarkFallingColor()
  {
    return (EReference)klimatrendEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSymbol()
  {
    return symbolEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSymbol_Device()
  {
    return (EAttribute)symbolEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSymbol_Get()
  {
    return (EAttribute)symbolEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSymbol_GetOn()
  {
    return (EAttribute)symbolEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSymbol_GetWarn()
  {
    return (EAttribute)symbolEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSymbol_GetOff()
  {
    return (EAttribute)symbolEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSymbol_Class()
  {
    return (EAttribute)symbolEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSymbol_Bgicon()
  {
    return (EAttribute)symbolEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSymbol_OffColor()
  {
    return (EReference)symbolEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSymbol_Icons()
  {
    return (EAttribute)symbolEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSymbol_OnColors()
  {
    return (EReference)symbolEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSymbol_OnBackgroundColors()
  {
    return (EReference)symbolEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleClock()
  {
    return simpleClockEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleClock_Id()
  {
    return (EAttribute)simpleClockEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleClock_DateFormat()
  {
    return (EAttribute)simpleClockEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleClock_TimeFormat()
  {
    return (EAttribute)simpleClockEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleClock_DateColor()
  {
    return (EReference)simpleClockEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleClock_TimeColor()
  {
    return (EReference)simpleClockEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleClock_Class()
  {
    return (EAttribute)simpleClockEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleClock_Style()
  {
    return (EAttribute)simpleClockEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getSimpleClock_BgColors()
  {
    return (EReference)simpleClockEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getSimpleChart()
  {
    return simpleChartEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleChart_Device()
  {
    return (EAttribute)simpleChartEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleChart_Log_device()
  {
    return (EAttribute)simpleChartEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleChart_Logfile()
  {
    return (EAttribute)simpleChartEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleChart_ColumnSpec()
  {
    return (EAttribute)simpleChartEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleChart_Min()
  {
    return (EAttribute)simpleChartEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleChart_Max()
  {
    return (EAttribute)simpleChartEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleChart_XTicks()
  {
    return (EAttribute)simpleChartEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleChart_YTicks()
  {
    return (EAttribute)simpleChartEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleChart_Daysago()
  {
    return (EAttribute)simpleChartEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getSimpleChart_Class()
  {
    return (EAttribute)simpleChartEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getColor()
  {
    return colorEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColor_Name()
  {
    return (EAttribute)colorEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getColor_Rgb()
  {
    return (EAttribute)colorEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getLabel()
  {
    return labelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLabel_Device()
  {
    return (EAttribute)labelEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLabel_Get()
  {
    return (EAttribute)labelEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLabel_Class()
  {
    return (EAttribute)labelEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLabel_Style()
  {
    return (EAttribute)labelEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLabel_Unit()
  {
    return (EAttribute)labelEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLabel_Part()
  {
    return (EAttribute)labelEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getLabel_Substitution()
  {
    return (EAttribute)labelEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TabletUIDSLFactory getTabletUIDSLFactory()
  {
    return (TabletUIDSLFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    tabletUIEClass = createEClass(TABLET_UI);
    createEReference(tabletUIEClass, TABLET_UI__SETTINGS);
    createEReference(tabletUIEClass, TABLET_UI__ELEMENTS);

    settingsEClass = createEClass(SETTINGS);
    createEAttribute(settingsEClass, SETTINGS__TITLE);
    createEAttribute(settingsEClass, SETTINGS__FHEMWEB_URL);
    createEAttribute(settingsEClass, SETTINGS__WIDTH);
    createEAttribute(settingsEClass, SETTINGS__HEIGHT);
    createEAttribute(settingsEClass, SETTINGS__COLUMNS);
    createEAttribute(settingsEClass, SETTINGS__ROWS);
    createEAttribute(settingsEClass, SETTINGS__DEBUG);
    createEAttribute(settingsEClass, SETTINGS__DRAGDROP);
    createEAttribute(settingsEClass, SETTINGS__MARGIN);
    createEReference(settingsEClass, SETTINGS__SETTINGS);

    settingsElementEClass = createEClass(SETTINGS_ELEMENT);

    cssEClass = createEClass(CSS);
    createEAttribute(cssEClass, CSS__PATH);

    abstractElementEClass = createEClass(ABSTRACT_ELEMENT);
    createEAttribute(abstractElementEClass, ABSTRACT_ELEMENT__NAME);

    pageEClass = createEClass(PAGE);
    createEReference(pageEClass, PAGE__SCREENSAVER);
    createEReference(pageEClass, PAGE__ELEMENTS);

    screensaverEClass = createEClass(SCREENSAVER);
    createEReference(screensaverEClass, SCREENSAVER__WIDGETS);

    templateEClass = createEClass(TEMPLATE);
    createEReference(templateEClass, TEMPLATE__ELEMENTS);

    gridsterEClass = createEClass(GRIDSTER);
    createEAttribute(gridsterEClass, GRIDSTER__HEADER);
    createEAttribute(gridsterEClass, GRIDSTER__ROW);
    createEAttribute(gridsterEClass, GRIDSTER__COLUMN);
    createEAttribute(gridsterEClass, GRIDSTER__COLSPAN);
    createEAttribute(gridsterEClass, GRIDSTER__ROWSPAN);
    createEAttribute(gridsterEClass, GRIDSTER__CLASS);
    createEAttribute(gridsterEClass, GRIDSTER__STYLE);
    createEReference(gridsterEClass, GRIDSTER__COLORS);
    createEReference(gridsterEClass, GRIDSTER__WIDGETS);

    widgetDefEClass = createEClass(WIDGET_DEF);

    widgetEClass = createEClass(WIDGET);

    clockEClass = createEClass(CLOCK);
    createEAttribute(clockEClass, CLOCK__FORMAT);
    createEAttribute(clockEClass, CLOCK__CLASS);
    createEAttribute(clockEClass, CLOCK__STYLE);
    createEAttribute(clockEClass, CLOCK__INTERVAL);
    createEAttribute(clockEClass, CLOCK__DAYS);
    createEAttribute(clockEClass, CLOCK__SHORTDAY_LENGTH);
    createEAttribute(clockEClass, CLOCK__MONTH);
    createEAttribute(clockEClass, CLOCK__MONTH_LENGTH);

    swiperEClass = createEClass(SWIPER);
    createEAttribute(swiperEClass, SWIPER__WIDTH);
    createEAttribute(swiperEClass, SWIPER__HEIGHT);
    createEAttribute(swiperEClass, SWIPER__AUTOPLAY);
    createEAttribute(swiperEClass, SWIPER__CLASS);
    createEReference(swiperEClass, SWIPER__DIVS);

    templateRefEClass = createEClass(TEMPLATE_REF);
    createEReference(templateRefEClass, TEMPLATE_REF__TEMPLATE);

    selectEClass = createEClass(SELECT);
    createEAttribute(selectEClass, SELECT__DEVICE);
    createEAttribute(selectEClass, SELECT__LIST);
    createEAttribute(selectEClass, SELECT__ITEMS);
    createEAttribute(selectEClass, SELECT__ALIAS);
    createEAttribute(selectEClass, SELECT__CMD);
    createEAttribute(selectEClass, SELECT__QUOTE);
    createEAttribute(selectEClass, SELECT__GET);
    createEAttribute(selectEClass, SELECT__SET);
    createEAttribute(selectEClass, SELECT__CLASS);

    volumeEClass = createEClass(VOLUME);
    createEAttribute(volumeEClass, VOLUME__DEVICE);
    createEAttribute(volumeEClass, VOLUME__GET);
    createEAttribute(volumeEClass, VOLUME__SET);
    createEAttribute(volumeEClass, VOLUME__CMD);
    createEAttribute(volumeEClass, VOLUME__MIN);
    createEAttribute(volumeEClass, VOLUME__MAX);
    createEAttribute(volumeEClass, VOLUME__CLASS);

    pushEClass = createEClass(PUSH);
    createEAttribute(pushEClass, PUSH__DEVICE);
    createEAttribute(pushEClass, PUSH__DATA_SET);
    createEAttribute(pushEClass, PUSH__SET_ON);
    createEAttribute(pushEClass, PUSH__ICON);
    createEAttribute(pushEClass, PUSH__BACKGROUND_ICON);
    createEAttribute(pushEClass, PUSH__CMD);
    createEAttribute(pushEClass, PUSH__DOUBLE_CLICK);
    createEAttribute(pushEClass, PUSH__COUNTDOWN);
    createEAttribute(pushEClass, PUSH__CLASS);
    createEAttribute(pushEClass, PUSH__URL);

    imageEClass = createEClass(IMAGE);
    createEAttribute(imageEClass, IMAGE__DEVICE);
    createEAttribute(imageEClass, IMAGE__GET);
    createEAttribute(imageEClass, IMAGE__SIZE);
    createEAttribute(imageEClass, IMAGE__CLASS);

    switchEClass = createEClass(SWITCH);
    createEAttribute(switchEClass, SWITCH__DEVICE);
    createEAttribute(switchEClass, SWITCH__GET);
    createEAttribute(switchEClass, SWITCH__GET_ON);
    createEAttribute(switchEClass, SWITCH__SET_ON);
    createEAttribute(switchEClass, SWITCH__GET_OFF);
    createEAttribute(switchEClass, SWITCH__CLASS);
    createEReference(switchEClass, SWITCH__ON_COLOR);
    createEReference(switchEClass, SWITCH__OFF_COLOR);
    createEReference(switchEClass, SWITCH__ON_BACK_GROUND_COLOR);
    createEAttribute(switchEClass, SWITCH__BACKGROUND_ICON);
    createEAttribute(switchEClass, SWITCH__ICON);

    customEClass = createEClass(CUSTOM);
    createEAttribute(customEClass, CUSTOM__CODE);

    divEClass = createEClass(DIV);
    createEAttribute(divEClass, DIV__CLASS);
    createEAttribute(divEClass, DIV__STYLE);
    createEReference(divEClass, DIV__WIDGETS);

    itunes_artworkEClass = createEClass(ITUNES_ARTWORK);
    createEAttribute(itunes_artworkEClass, ITUNES_ARTWORK__DEVICE);
    createEAttribute(itunes_artworkEClass, ITUNES_ARTWORK__GET);
    createEAttribute(itunes_artworkEClass, ITUNES_ARTWORK__OPACITY);
    createEAttribute(itunes_artworkEClass, ITUNES_ARTWORK__SIZE);
    createEAttribute(itunes_artworkEClass, ITUNES_ARTWORK__CLASS);
    createEAttribute(itunes_artworkEClass, ITUNES_ARTWORK__STYLE);

    weatherEClass = createEClass(WEATHER);
    createEAttribute(weatherEClass, WEATHER__DEVICE);
    createEAttribute(weatherEClass, WEATHER__GET);
    createEAttribute(weatherEClass, WEATHER__CLASS);
    createEAttribute(weatherEClass, WEATHER__IMAGESET);
    createEAttribute(weatherEClass, WEATHER__IMAGE_PATH);

    calviewEClass = createEClass(CALVIEW);
    createEAttribute(calviewEClass, CALVIEW__DEVICE);
    createEAttribute(calviewEClass, CALVIEW__GET);
    createEAttribute(calviewEClass, CALVIEW__MAX);
    createEAttribute(calviewEClass, CALVIEW__CLASS);
    createEReference(calviewEClass, CALVIEW__ALL_FC);
    createEReference(calviewEClass, CALVIEW__ALL_TC);

    popupEClass = createEClass(POPUP);
    createEAttribute(popupEClass, POPUP__WIDTH);
    createEAttribute(popupEClass, POPUP__HEIGHT);
    createEAttribute(popupEClass, POPUP__OPEN_ICON);
    createEAttribute(popupEClass, POPUP__OPEN_BACKGROUND_ICON);
    createEAttribute(popupEClass, POPUP__OPEN_CLASS);
    createEAttribute(popupEClass, POPUP__DIALOG_CLASS);
    createEAttribute(popupEClass, POPUP__DIALOG_HEADER_CLASS);
    createEAttribute(popupEClass, POPUP__HEADER);
    createEReference(popupEClass, POPUP__WIDGETS);

    linkEClass = createEClass(LINK);
    createEAttribute(linkEClass, LINK__WIDTH);
    createEAttribute(linkEClass, LINK__HEIGHT);
    createEReference(linkEClass, LINK__COLOR);
    createEAttribute(linkEClass, LINK__CLASS);
    createEReference(linkEClass, LINK__BACKGROUND_COLOR);
    createEAttribute(linkEClass, LINK__ICON);
    createEAttribute(linkEClass, LINK__CMD);
    createEAttribute(linkEClass, LINK__LABEL);

    buttonUrlEClass = createEClass(BUTTON_URL);
    createEAttribute(buttonUrlEClass, BUTTON_URL__URL);
    createEReference(buttonUrlEClass, BUTTON_URL__PAGE);
    createEAttribute(buttonUrlEClass, BUTTON_URL__FHEM_CMD);

    buttonEClass = createEClass(BUTTON);
    createEAttribute(buttonEClass, BUTTON__DEVICE);
    createEAttribute(buttonEClass, BUTTON__GET);
    createEAttribute(buttonEClass, BUTTON__GET_ON);
    createEAttribute(buttonEClass, BUTTON__GET_WARN);
    createEAttribute(buttonEClass, BUTTON__GET_OFF);
    createEReference(buttonEClass, BUTTON__TARGET);
    createEAttribute(buttonEClass, BUTTON__ICON);
    createEAttribute(buttonEClass, BUTTON__BACKGROUND_ICON);
    createEAttribute(buttonEClass, BUTTON__CLASS);
    createEReference(buttonEClass, BUTTON__ON_COLOR);
    createEReference(buttonEClass, BUTTON__ON_BACKGROUND_COLOR);
    createEReference(buttonEClass, BUTTON__OFF_COLOR);
    createEReference(buttonEClass, BUTTON__OFF_BACKGROUND_COLOR);

    klimatrendEClass = createEClass(KLIMATREND);
    createEAttribute(klimatrendEClass, KLIMATREND__DEVICE);
    createEAttribute(klimatrendEClass, KLIMATREND__GET);
    createEAttribute(klimatrendEClass, KLIMATREND__CLASS);
    createEAttribute(klimatrendEClass, KLIMATREND__REFPERIOD);
    createEReference(klimatrendEClass, KLIMATREND__STAGNATING_COLOR);
    createEAttribute(klimatrendEClass, KLIMATREND__ICON);
    createEReference(klimatrendEClass, KLIMATREND__RISING_COLOR);
    createEReference(klimatrendEClass, KLIMATREND__FALLING_COLOR);
    createEAttribute(klimatrendEClass, KLIMATREND__HIGHMARK);
    createEAttribute(klimatrendEClass, KLIMATREND__HIGHMARK_ICON);
    createEReference(klimatrendEClass, KLIMATREND__HIGHMARK_RISING_COLOR);
    createEReference(klimatrendEClass, KLIMATREND__HIGHMARK_FALLING_COLOR);

    symbolEClass = createEClass(SYMBOL);
    createEAttribute(symbolEClass, SYMBOL__DEVICE);
    createEAttribute(symbolEClass, SYMBOL__GET);
    createEAttribute(symbolEClass, SYMBOL__GET_ON);
    createEAttribute(symbolEClass, SYMBOL__GET_WARN);
    createEAttribute(symbolEClass, SYMBOL__GET_OFF);
    createEAttribute(symbolEClass, SYMBOL__CLASS);
    createEAttribute(symbolEClass, SYMBOL__BGICON);
    createEReference(symbolEClass, SYMBOL__OFF_COLOR);
    createEAttribute(symbolEClass, SYMBOL__ICONS);
    createEReference(symbolEClass, SYMBOL__ON_COLORS);
    createEReference(symbolEClass, SYMBOL__ON_BACKGROUND_COLORS);

    simpleClockEClass = createEClass(SIMPLE_CLOCK);
    createEAttribute(simpleClockEClass, SIMPLE_CLOCK__ID);
    createEAttribute(simpleClockEClass, SIMPLE_CLOCK__DATE_FORMAT);
    createEAttribute(simpleClockEClass, SIMPLE_CLOCK__TIME_FORMAT);
    createEReference(simpleClockEClass, SIMPLE_CLOCK__DATE_COLOR);
    createEReference(simpleClockEClass, SIMPLE_CLOCK__TIME_COLOR);
    createEAttribute(simpleClockEClass, SIMPLE_CLOCK__CLASS);
    createEAttribute(simpleClockEClass, SIMPLE_CLOCK__STYLE);
    createEReference(simpleClockEClass, SIMPLE_CLOCK__BG_COLORS);

    simpleChartEClass = createEClass(SIMPLE_CHART);
    createEAttribute(simpleChartEClass, SIMPLE_CHART__DEVICE);
    createEAttribute(simpleChartEClass, SIMPLE_CHART__LOG_DEVICE);
    createEAttribute(simpleChartEClass, SIMPLE_CHART__LOGFILE);
    createEAttribute(simpleChartEClass, SIMPLE_CHART__COLUMN_SPEC);
    createEAttribute(simpleChartEClass, SIMPLE_CHART__MIN);
    createEAttribute(simpleChartEClass, SIMPLE_CHART__MAX);
    createEAttribute(simpleChartEClass, SIMPLE_CHART__XTICKS);
    createEAttribute(simpleChartEClass, SIMPLE_CHART__YTICKS);
    createEAttribute(simpleChartEClass, SIMPLE_CHART__DAYSAGO);
    createEAttribute(simpleChartEClass, SIMPLE_CHART__CLASS);

    colorEClass = createEClass(COLOR);
    createEAttribute(colorEClass, COLOR__NAME);
    createEAttribute(colorEClass, COLOR__RGB);

    labelEClass = createEClass(LABEL);
    createEAttribute(labelEClass, LABEL__DEVICE);
    createEAttribute(labelEClass, LABEL__GET);
    createEAttribute(labelEClass, LABEL__CLASS);
    createEAttribute(labelEClass, LABEL__STYLE);
    createEAttribute(labelEClass, LABEL__UNIT);
    createEAttribute(labelEClass, LABEL__PART);
    createEAttribute(labelEClass, LABEL__SUBSTITUTION);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    cssEClass.getESuperTypes().add(this.getSettingsElement());
    pageEClass.getESuperTypes().add(this.getAbstractElement());
    screensaverEClass.getESuperTypes().add(this.getAbstractElement());
    templateEClass.getESuperTypes().add(this.getAbstractElement());
    widgetEClass.getESuperTypes().add(this.getWidgetDef());
    clockEClass.getESuperTypes().add(this.getWidget());
    swiperEClass.getESuperTypes().add(this.getWidget());
    templateRefEClass.getESuperTypes().add(this.getWidget());
    selectEClass.getESuperTypes().add(this.getWidget());
    volumeEClass.getESuperTypes().add(this.getWidget());
    pushEClass.getESuperTypes().add(this.getWidget());
    imageEClass.getESuperTypes().add(this.getWidget());
    switchEClass.getESuperTypes().add(this.getWidget());
    customEClass.getESuperTypes().add(this.getWidget());
    divEClass.getESuperTypes().add(this.getWidgetDef());
    itunes_artworkEClass.getESuperTypes().add(this.getWidget());
    weatherEClass.getESuperTypes().add(this.getWidget());
    calviewEClass.getESuperTypes().add(this.getWidget());
    popupEClass.getESuperTypes().add(this.getWidget());
    linkEClass.getESuperTypes().add(this.getWidget());
    buttonEClass.getESuperTypes().add(this.getWidget());
    klimatrendEClass.getESuperTypes().add(this.getWidget());
    symbolEClass.getESuperTypes().add(this.getWidget());
    simpleClockEClass.getESuperTypes().add(this.getWidget());
    simpleChartEClass.getESuperTypes().add(this.getWidget());
    colorEClass.getESuperTypes().add(this.getSettingsElement());
    labelEClass.getESuperTypes().add(this.getWidget());

    // Initialize classes and features; add operations and parameters
    initEClass(tabletUIEClass, TabletUI.class, "TabletUI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTabletUI_Settings(), this.getSettings(), null, "settings", null, 0, 1, TabletUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getTabletUI_Elements(), this.getAbstractElement(), null, "elements", null, 0, -1, TabletUI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(settingsEClass, Settings.class, "Settings", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSettings_Title(), ecorePackage.getEString(), "title", null, 0, 1, Settings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSettings_Fhemweb_url(), ecorePackage.getEString(), "fhemweb_url", null, 0, 1, Settings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSettings_Width(), ecorePackage.getEInt(), "width", null, 0, 1, Settings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSettings_Height(), ecorePackage.getEInt(), "height", null, 0, 1, Settings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSettings_Columns(), ecorePackage.getEInt(), "columns", null, 0, 1, Settings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSettings_Rows(), ecorePackage.getEInt(), "rows", null, 0, 1, Settings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSettings_Debug(), ecorePackage.getEString(), "debug", null, 0, 1, Settings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSettings_Dragdrop(), ecorePackage.getEString(), "dragdrop", null, 0, 1, Settings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSettings_Margin(), ecorePackage.getEInt(), "margin", null, 0, 1, Settings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSettings_Settings(), this.getSettingsElement(), null, "settings", null, 0, -1, Settings.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(settingsElementEClass, SettingsElement.class, "SettingsElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(cssEClass, org.ckr.tabletUIDSL.CSS.class, "CSS", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCSS_Path(), ecorePackage.getEString(), "path", null, 0, 1, org.ckr.tabletUIDSL.CSS.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(abstractElementEClass, AbstractElement.class, "AbstractElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAbstractElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, AbstractElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pageEClass, Page.class, "Page", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getPage_Screensaver(), this.getScreensaver(), null, "screensaver", null, 0, 1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPage_Elements(), this.getGridster(), null, "elements", null, 0, -1, Page.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(screensaverEClass, Screensaver.class, "Screensaver", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getScreensaver_Widgets(), this.getWidgetDef(), null, "widgets", null, 0, -1, Screensaver.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(templateEClass, Template.class, "Template", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTemplate_Elements(), this.getDiv(), null, "elements", null, 0, -1, Template.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(gridsterEClass, Gridster.class, "Gridster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGridster_Header(), ecorePackage.getEString(), "header", null, 0, 1, Gridster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGridster_Row(), ecorePackage.getEInt(), "row", null, 0, 1, Gridster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGridster_Column(), ecorePackage.getEInt(), "column", null, 0, 1, Gridster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGridster_Colspan(), ecorePackage.getEInt(), "colspan", null, 0, 1, Gridster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGridster_Rowspan(), ecorePackage.getEInt(), "rowspan", null, 0, 1, Gridster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGridster_Class(), ecorePackage.getEString(), "class", null, 0, 1, Gridster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGridster_Style(), ecorePackage.getEString(), "style", null, 0, 1, Gridster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGridster_Colors(), this.getColor(), null, "colors", null, 0, -1, Gridster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGridster_Widgets(), this.getWidgetDef(), null, "widgets", null, 0, -1, Gridster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(widgetDefEClass, WidgetDef.class, "WidgetDef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(widgetEClass, Widget.class, "Widget", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(clockEClass, Clock.class, "Clock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getClock_Format(), ecorePackage.getEString(), "format", null, 0, 1, Clock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClock_Class(), ecorePackage.getEString(), "class", null, 0, 1, Clock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClock_Style(), ecorePackage.getEString(), "style", null, 0, 1, Clock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClock_Interval(), ecorePackage.getEInt(), "interval", null, 0, 1, Clock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClock_Days(), ecorePackage.getEString(), "days", null, 0, -1, Clock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClock_ShortdayLength(), ecorePackage.getEInt(), "shortdayLength", null, 0, 1, Clock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClock_Month(), ecorePackage.getEString(), "month", null, 0, -1, Clock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getClock_MonthLength(), ecorePackage.getEInt(), "monthLength", null, 0, 1, Clock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(swiperEClass, Swiper.class, "Swiper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSwiper_Width(), ecorePackage.getEString(), "width", null, 0, 1, Swiper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSwiper_Height(), ecorePackage.getEString(), "height", null, 0, 1, Swiper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSwiper_Autoplay(), ecorePackage.getEInt(), "autoplay", null, 0, 1, Swiper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSwiper_Class(), ecorePackage.getEString(), "class", null, 0, 1, Swiper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSwiper_Divs(), this.getDiv(), null, "divs", null, 0, -1, Swiper.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(templateRefEClass, TemplateRef.class, "TemplateRef", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getTemplateRef_Template(), this.getTemplate(), null, "template", null, 0, -1, TemplateRef.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(selectEClass, Select.class, "Select", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSelect_Device(), ecorePackage.getEString(), "device", null, 0, 1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSelect_List(), ecorePackage.getEString(), "list", null, 0, 1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSelect_Items(), ecorePackage.getEString(), "items", null, 0, 1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSelect_Alias(), ecorePackage.getEString(), "alias", null, 0, 1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSelect_Cmd(), ecorePackage.getEString(), "cmd", null, 0, 1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSelect_Quote(), ecorePackage.getEString(), "quote", null, 0, 1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSelect_Get(), ecorePackage.getEString(), "get", null, 0, 1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSelect_Set(), ecorePackage.getEString(), "set", null, 0, 1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSelect_Class(), ecorePackage.getEString(), "class", null, 0, 1, Select.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(volumeEClass, Volume.class, "Volume", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVolume_Device(), ecorePackage.getEString(), "device", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVolume_Get(), ecorePackage.getEString(), "get", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVolume_Set(), ecorePackage.getEString(), "set", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVolume_Cmd(), ecorePackage.getEString(), "cmd", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVolume_Min(), ecorePackage.getEString(), "min", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVolume_Max(), ecorePackage.getEString(), "max", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVolume_Class(), ecorePackage.getEString(), "class", null, 0, 1, Volume.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(pushEClass, Push.class, "Push", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPush_Device(), ecorePackage.getEString(), "device", null, 0, 1, Push.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPush_DataSet(), ecorePackage.getEString(), "dataSet", null, 0, 1, Push.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPush_SetOn(), ecorePackage.getEString(), "setOn", null, 0, 1, Push.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPush_Icon(), ecorePackage.getEString(), "icon", null, 0, 1, Push.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPush_BackgroundIcon(), ecorePackage.getEString(), "backgroundIcon", null, 0, 1, Push.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPush_Cmd(), ecorePackage.getEString(), "cmd", null, 0, 1, Push.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPush_DoubleClick(), ecorePackage.getEInt(), "doubleClick", null, 0, 1, Push.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPush_Countdown(), ecorePackage.getEString(), "countdown", null, 0, 1, Push.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPush_Class(), ecorePackage.getEString(), "class", null, 0, 1, Push.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPush_Url(), ecorePackage.getEString(), "url", null, 0, 1, Push.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(imageEClass, Image.class, "Image", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getImage_Device(), ecorePackage.getEString(), "device", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImage_Get(), ecorePackage.getEString(), "get", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImage_Size(), ecorePackage.getEString(), "size", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getImage_Class(), ecorePackage.getEString(), "class", null, 0, 1, Image.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(switchEClass, Switch.class, "Switch", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSwitch_Device(), ecorePackage.getEString(), "device", null, 0, 1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSwitch_Get(), ecorePackage.getEString(), "get", null, 0, 1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSwitch_GetOn(), ecorePackage.getEString(), "getOn", null, 0, 1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSwitch_SetOn(), ecorePackage.getEString(), "setOn", null, 0, 1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSwitch_GetOff(), ecorePackage.getEString(), "getOff", null, 0, 1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSwitch_Class(), ecorePackage.getEString(), "class", null, 0, 1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSwitch_OnColor(), this.getColor(), null, "onColor", null, 0, 1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSwitch_OffColor(), this.getColor(), null, "offColor", null, 0, 1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSwitch_OnBackGroundColor(), this.getColor(), null, "onBackGroundColor", null, 0, 1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSwitch_BackgroundIcon(), ecorePackage.getEString(), "backgroundIcon", null, 0, 1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSwitch_Icon(), ecorePackage.getEString(), "icon", null, 0, 1, Switch.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(customEClass, Custom.class, "Custom", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCustom_Code(), ecorePackage.getEString(), "code", null, 0, 1, Custom.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(divEClass, Div.class, "Div", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDiv_Class(), ecorePackage.getEString(), "class", null, 0, 1, Div.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDiv_Style(), ecorePackage.getEString(), "style", null, 0, 1, Div.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDiv_Widgets(), this.getWidgetDef(), null, "widgets", null, 0, -1, Div.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(itunes_artworkEClass, itunes_artwork.class, "itunes_artwork", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getitunes_artwork_Device(), ecorePackage.getEString(), "device", null, 0, 1, itunes_artwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getitunes_artwork_Get(), ecorePackage.getEString(), "get", null, 0, -1, itunes_artwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getitunes_artwork_Opacity(), ecorePackage.getEString(), "opacity", null, 0, 1, itunes_artwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getitunes_artwork_Size(), ecorePackage.getEString(), "size", null, 0, 1, itunes_artwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getitunes_artwork_Class(), ecorePackage.getEString(), "class", null, 0, 1, itunes_artwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getitunes_artwork_Style(), ecorePackage.getEString(), "style", null, 0, 1, itunes_artwork.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(weatherEClass, Weather.class, "Weather", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getWeather_Device(), ecorePackage.getEString(), "device", null, 0, 1, Weather.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWeather_Get(), ecorePackage.getEString(), "get", null, 0, 1, Weather.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWeather_Class(), ecorePackage.getEString(), "class", null, 0, 1, Weather.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWeather_Imageset(), ecorePackage.getEString(), "imageset", null, 0, 1, Weather.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getWeather_ImagePath(), ecorePackage.getEString(), "imagePath", null, 0, 1, Weather.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(calviewEClass, Calview.class, "Calview", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCalview_Device(), ecorePackage.getEString(), "device", null, 0, 1, Calview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCalview_Get(), ecorePackage.getEString(), "get", null, 0, 1, Calview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCalview_Max(), ecorePackage.getEInt(), "max", null, 0, 1, Calview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getCalview_Class(), ecorePackage.getEString(), "class", null, 0, 1, Calview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCalview_AllFC(), this.getColor(), null, "allFC", null, 0, 1, Calview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCalview_AllTC(), this.getColor(), null, "allTC", null, 0, 1, Calview.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(popupEClass, Popup.class, "Popup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getPopup_Width(), ecorePackage.getEString(), "width", null, 0, 1, Popup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPopup_Height(), ecorePackage.getEString(), "height", null, 0, 1, Popup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPopup_OpenIcon(), ecorePackage.getEString(), "openIcon", null, 0, 1, Popup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPopup_OpenBackgroundIcon(), ecorePackage.getEString(), "openBackgroundIcon", null, 0, 1, Popup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPopup_OpenClass(), ecorePackage.getEString(), "openClass", null, 0, 1, Popup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPopup_DialogClass(), ecorePackage.getEString(), "dialogClass", null, 0, 1, Popup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPopup_DialogHeaderClass(), ecorePackage.getEString(), "dialogHeaderClass", null, 0, 1, Popup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getPopup_Header(), ecorePackage.getEString(), "header", null, 0, 1, Popup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getPopup_Widgets(), this.getWidget(), null, "widgets", null, 0, -1, Popup.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(linkEClass, Link.class, "Link", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLink_Width(), ecorePackage.getEString(), "width", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLink_Height(), ecorePackage.getEString(), "height", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLink_Color(), this.getColor(), null, "color", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLink_Class(), ecorePackage.getEString(), "class", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getLink_BackgroundColor(), this.getColor(), null, "backgroundColor", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLink_Icon(), ecorePackage.getEString(), "icon", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLink_Cmd(), ecorePackage.getEString(), "cmd", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLink_Label(), ecorePackage.getEString(), "label", null, 0, 1, Link.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(buttonUrlEClass, ButtonUrl.class, "ButtonUrl", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getButtonUrl_Url(), ecorePackage.getEString(), "url", null, 0, 1, ButtonUrl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getButtonUrl_Page(), this.getPage(), null, "page", null, 0, 1, ButtonUrl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getButtonUrl_FhemCmd(), ecorePackage.getEString(), "fhemCmd", null, 0, 1, ButtonUrl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(buttonEClass, Button.class, "Button", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getButton_Device(), ecorePackage.getEString(), "device", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getButton_Get(), ecorePackage.getEString(), "get", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getButton_GetOn(), ecorePackage.getEString(), "getOn", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getButton_GetWarn(), ecorePackage.getEString(), "getWarn", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getButton_GetOff(), ecorePackage.getEString(), "getOff", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getButton_Target(), this.getButtonUrl(), null, "target", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getButton_Icon(), ecorePackage.getEString(), "icon", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getButton_BackgroundIcon(), ecorePackage.getEString(), "backgroundIcon", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getButton_Class(), ecorePackage.getEString(), "class", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getButton_OnColor(), this.getColor(), null, "onColor", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getButton_OnBackgroundColor(), this.getColor(), null, "onBackgroundColor", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getButton_OffColor(), this.getColor(), null, "offColor", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getButton_OffBackgroundColor(), this.getColor(), null, "offBackgroundColor", null, 0, 1, Button.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(klimatrendEClass, Klimatrend.class, "Klimatrend", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getKlimatrend_Device(), ecorePackage.getEString(), "device", null, 0, 1, Klimatrend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKlimatrend_Get(), ecorePackage.getEString(), "get", null, 0, 1, Klimatrend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKlimatrend_Class(), ecorePackage.getEString(), "class", null, 0, 1, Klimatrend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKlimatrend_Refperiod(), ecorePackage.getEInt(), "refperiod", null, 0, 1, Klimatrend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKlimatrend_StagnatingColor(), this.getColor(), null, "stagnatingColor", null, 0, 1, Klimatrend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKlimatrend_Icon(), ecorePackage.getEString(), "icon", null, 0, 1, Klimatrend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKlimatrend_RisingColor(), this.getColor(), null, "risingColor", null, 0, 1, Klimatrend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKlimatrend_FallingColor(), this.getColor(), null, "fallingColor", null, 0, 1, Klimatrend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKlimatrend_Highmark(), ecorePackage.getEInt(), "highmark", null, 0, 1, Klimatrend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getKlimatrend_HighmarkIcon(), ecorePackage.getEString(), "highmarkIcon", null, 0, 1, Klimatrend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKlimatrend_HighmarkRisingColor(), this.getColor(), null, "highmarkRisingColor", null, 0, 1, Klimatrend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getKlimatrend_HighmarkFallingColor(), this.getColor(), null, "highmarkFallingColor", null, 0, 1, Klimatrend.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(symbolEClass, Symbol.class, "Symbol", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSymbol_Device(), ecorePackage.getEString(), "device", null, 0, 1, Symbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSymbol_Get(), ecorePackage.getEString(), "get", null, 0, 1, Symbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSymbol_GetOn(), ecorePackage.getEString(), "getOn", null, 0, -1, Symbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSymbol_GetWarn(), ecorePackage.getEString(), "getWarn", null, 0, 1, Symbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSymbol_GetOff(), ecorePackage.getEString(), "getOff", null, 0, -1, Symbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSymbol_Class(), ecorePackage.getEString(), "class", null, 0, 1, Symbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSymbol_Bgicon(), ecorePackage.getEString(), "bgicon", null, 0, 1, Symbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSymbol_OffColor(), this.getColor(), null, "offColor", null, 0, 1, Symbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSymbol_Icons(), ecorePackage.getEString(), "icons", null, 0, -1, Symbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSymbol_OnColors(), this.getColor(), null, "onColors", null, 0, -1, Symbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSymbol_OnBackgroundColors(), this.getColor(), null, "onBackgroundColors", null, 0, -1, Symbol.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simpleClockEClass, SimpleClock.class, "SimpleClock", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSimpleClock_Id(), ecorePackage.getEString(), "id", null, 0, 1, SimpleClock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleClock_DateFormat(), ecorePackage.getEString(), "dateFormat", null, 0, 1, SimpleClock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleClock_TimeFormat(), ecorePackage.getEString(), "timeFormat", null, 0, 1, SimpleClock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSimpleClock_DateColor(), this.getColor(), null, "dateColor", null, 0, 1, SimpleClock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSimpleClock_TimeColor(), this.getColor(), null, "timeColor", null, 0, 1, SimpleClock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleClock_Class(), ecorePackage.getEString(), "class", null, 0, 1, SimpleClock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleClock_Style(), ecorePackage.getEString(), "style", null, 0, 1, SimpleClock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getSimpleClock_BgColors(), this.getColor(), null, "bgColors", null, 0, -1, SimpleClock.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(simpleChartEClass, SimpleChart.class, "SimpleChart", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getSimpleChart_Device(), ecorePackage.getEString(), "device", null, 0, 1, SimpleChart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleChart_Log_device(), ecorePackage.getEString(), "log_device", null, 0, 1, SimpleChart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleChart_Logfile(), ecorePackage.getEString(), "logfile", null, 0, 1, SimpleChart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleChart_ColumnSpec(), ecorePackage.getEString(), "columnSpec", null, 0, 1, SimpleChart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleChart_Min(), ecorePackage.getEString(), "min", null, 0, 1, SimpleChart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleChart_Max(), ecorePackage.getEString(), "max", null, 0, 1, SimpleChart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleChart_XTicks(), ecorePackage.getEInt(), "xTicks", null, 0, 1, SimpleChart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleChart_YTicks(), ecorePackage.getEInt(), "yTicks", null, 0, 1, SimpleChart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleChart_Daysago(), ecorePackage.getEInt(), "daysago", null, 0, 1, SimpleChart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getSimpleChart_Class(), ecorePackage.getEString(), "class", null, 0, 1, SimpleChart.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(colorEClass, Color.class, "Color", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getColor_Name(), ecorePackage.getEString(), "name", null, 0, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getColor_Rgb(), ecorePackage.getEString(), "rgb", null, 0, 1, Color.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(labelEClass, Label.class, "Label", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getLabel_Device(), ecorePackage.getEString(), "device", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLabel_Get(), ecorePackage.getEString(), "get", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLabel_Class(), ecorePackage.getEString(), "class", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLabel_Style(), ecorePackage.getEString(), "style", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLabel_Unit(), ecorePackage.getEString(), "unit", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLabel_Part(), ecorePackage.getEString(), "part", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getLabel_Substitution(), ecorePackage.getEString(), "substitution", null, 0, 1, Label.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //TabletUIDSLPackageImpl
