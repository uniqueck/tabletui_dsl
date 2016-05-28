/**
 */
package org.ckr.tabletUIDSL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.ckr.tabletUIDSL.TabletUIDSLFactory
 * @model kind="package"
 * @generated
 */
public interface TabletUIDSLPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "tabletUIDSL";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ckr.org/TabletUIDSL";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "tabletUIDSL";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  TabletUIDSLPackage eINSTANCE = org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl.init();

  /**
   * The meta object id for the '{@link org.ckr.tabletUIDSL.impl.TabletUIImpl <em>Tablet UI</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ckr.tabletUIDSL.impl.TabletUIImpl
   * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getTabletUI()
   * @generated
   */
  int TABLET_UI = 0;

  /**
   * The feature id for the '<em><b>Settings</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLET_UI__SETTINGS = 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLET_UI__ELEMENTS = 1;

  /**
   * The number of structural features of the '<em>Tablet UI</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TABLET_UI_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.ckr.tabletUIDSL.impl.SettingsImpl <em>Settings</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ckr.tabletUIDSL.impl.SettingsImpl
   * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getSettings()
   * @generated
   */
  int SETTINGS = 1;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETTINGS__TITLE = 0;

  /**
   * The feature id for the '<em><b>Fhemweb url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETTINGS__FHEMWEB_URL = 1;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETTINGS__WIDTH = 2;

  /**
   * The feature id for the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETTINGS__HEIGHT = 3;

  /**
   * The feature id for the '<em><b>Columns</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETTINGS__COLUMNS = 4;

  /**
   * The feature id for the '<em><b>Rows</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETTINGS__ROWS = 5;

  /**
   * The feature id for the '<em><b>Debug</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETTINGS__DEBUG = 6;

  /**
   * The feature id for the '<em><b>Dragdrop</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETTINGS__DRAGDROP = 7;

  /**
   * The feature id for the '<em><b>Margin</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETTINGS__MARGIN = 8;

  /**
   * The feature id for the '<em><b>Settings</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETTINGS__SETTINGS = 9;

  /**
   * The number of structural features of the '<em>Settings</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETTINGS_FEATURE_COUNT = 10;

  /**
   * The meta object id for the '{@link org.ckr.tabletUIDSL.impl.SettingsElementImpl <em>Settings Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ckr.tabletUIDSL.impl.SettingsElementImpl
   * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getSettingsElement()
   * @generated
   */
  int SETTINGS_ELEMENT = 2;

  /**
   * The number of structural features of the '<em>Settings Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SETTINGS_ELEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.ckr.tabletUIDSL.impl.CSSImpl <em>CSS</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ckr.tabletUIDSL.impl.CSSImpl
   * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getCSS()
   * @generated
   */
  int CSS = 3;

  /**
   * The feature id for the '<em><b>Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS__PATH = SETTINGS_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>CSS</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CSS_FEATURE_COUNT = SETTINGS_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ckr.tabletUIDSL.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ckr.tabletUIDSL.impl.AbstractElementImpl
   * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getAbstractElement()
   * @generated
   */
  int ABSTRACT_ELEMENT = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ELEMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Abstract Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ELEMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link org.ckr.tabletUIDSL.impl.PageImpl <em>Page</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ckr.tabletUIDSL.impl.PageImpl
   * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getPage()
   * @generated
   */
  int PAGE = 5;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE__NAME = ABSTRACT_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Screensaver</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE__SCREENSAVER = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE__ELEMENTS = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Page</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PAGE_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.ckr.tabletUIDSL.impl.ScreensaverImpl <em>Screensaver</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ckr.tabletUIDSL.impl.ScreensaverImpl
   * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getScreensaver()
   * @generated
   */
  int SCREENSAVER = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREENSAVER__NAME = ABSTRACT_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREENSAVER__WIDGETS = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Screensaver</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SCREENSAVER_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ckr.tabletUIDSL.impl.TemplateImpl <em>Template</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ckr.tabletUIDSL.impl.TemplateImpl
   * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getTemplate()
   * @generated
   */
  int TEMPLATE = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE__NAME = ABSTRACT_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Elements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE__ELEMENTS = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Template</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_FEATURE_COUNT = ABSTRACT_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ckr.tabletUIDSL.impl.GridsterImpl <em>Gridster</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ckr.tabletUIDSL.impl.GridsterImpl
   * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getGridster()
   * @generated
   */
  int GRIDSTER = 8;

  /**
   * The feature id for the '<em><b>Header</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRIDSTER__HEADER = 0;

  /**
   * The feature id for the '<em><b>Row</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRIDSTER__ROW = 1;

  /**
   * The feature id for the '<em><b>Column</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRIDSTER__COLUMN = 2;

  /**
   * The feature id for the '<em><b>Colspan</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRIDSTER__COLSPAN = 3;

  /**
   * The feature id for the '<em><b>Rowspan</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRIDSTER__ROWSPAN = 4;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRIDSTER__CLASS = 5;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRIDSTER__STYLE = 6;

  /**
   * The feature id for the '<em><b>Colors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRIDSTER__COLORS = 7;

  /**
   * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRIDSTER__WIDGETS = 8;

  /**
   * The number of structural features of the '<em>Gridster</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRIDSTER_FEATURE_COUNT = 9;

  /**
   * The meta object id for the '{@link org.ckr.tabletUIDSL.impl.WidgetDefImpl <em>Widget Def</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ckr.tabletUIDSL.impl.WidgetDefImpl
   * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getWidgetDef()
   * @generated
   */
  int WIDGET_DEF = 9;

  /**
   * The number of structural features of the '<em>Widget Def</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDGET_DEF_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.ckr.tabletUIDSL.impl.WidgetImpl <em>Widget</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ckr.tabletUIDSL.impl.WidgetImpl
   * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getWidget()
   * @generated
   */
  int WIDGET = 10;

  /**
   * The number of structural features of the '<em>Widget</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDGET_FEATURE_COUNT = WIDGET_DEF_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link org.ckr.tabletUIDSL.impl.ClockImpl <em>Clock</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ckr.tabletUIDSL.impl.ClockImpl
   * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getClock()
   * @generated
   */
  int CLOCK = 11;

  /**
   * The feature id for the '<em><b>Format</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOCK__FORMAT = WIDGET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOCK__CLASS = WIDGET_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOCK__STYLE = WIDGET_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Interval</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOCK__INTERVAL = WIDGET_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Days</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOCK__DAYS = WIDGET_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Shortday Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOCK__SHORTDAY_LENGTH = WIDGET_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Month</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOCK__MONTH = WIDGET_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Month Length</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOCK__MONTH_LENGTH = WIDGET_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Clock</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CLOCK_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link org.ckr.tabletUIDSL.impl.SwiperImpl <em>Swiper</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ckr.tabletUIDSL.impl.SwiperImpl
   * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getSwiper()
   * @generated
   */
  int SWIPER = 12;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWIPER__WIDTH = WIDGET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWIPER__HEIGHT = WIDGET_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Autoplay</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWIPER__AUTOPLAY = WIDGET_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWIPER__CLASS = WIDGET_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Divs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWIPER__DIVS = WIDGET_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Swiper</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWIPER_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.ckr.tabletUIDSL.impl.TemplateRefImpl <em>Template Ref</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ckr.tabletUIDSL.impl.TemplateRefImpl
   * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getTemplateRef()
   * @generated
   */
  int TEMPLATE_REF = 13;

  /**
   * The feature id for the '<em><b>Template</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_REF__TEMPLATE = WIDGET_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Template Ref</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int TEMPLATE_REF_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ckr.tabletUIDSL.impl.SelectImpl <em>Select</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ckr.tabletUIDSL.impl.SelectImpl
   * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getSelect()
   * @generated
   */
  int SELECT = 14;

  /**
   * The feature id for the '<em><b>Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT__DEVICE = WIDGET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>List</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT__LIST = WIDGET_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Items</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT__ITEMS = WIDGET_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT__ALIAS = WIDGET_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Cmd</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT__CMD = WIDGET_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Quote</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT__QUOTE = WIDGET_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Get</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT__GET = WIDGET_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Set</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT__SET = WIDGET_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT__CLASS = WIDGET_FEATURE_COUNT + 8;

  /**
   * The number of structural features of the '<em>Select</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SELECT_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 9;

  /**
   * The meta object id for the '{@link org.ckr.tabletUIDSL.impl.VolumeImpl <em>Volume</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ckr.tabletUIDSL.impl.VolumeImpl
   * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getVolume()
   * @generated
   */
  int VOLUME = 15;

  /**
   * The feature id for the '<em><b>Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOLUME__DEVICE = WIDGET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Get</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOLUME__GET = WIDGET_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Set</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOLUME__SET = WIDGET_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Cmd</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOLUME__CMD = WIDGET_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOLUME__MIN = WIDGET_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOLUME__MAX = WIDGET_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOLUME__CLASS = WIDGET_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Volume</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VOLUME_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link org.ckr.tabletUIDSL.impl.PushImpl <em>Push</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ckr.tabletUIDSL.impl.PushImpl
   * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getPush()
   * @generated
   */
  int PUSH = 16;

  /**
   * The feature id for the '<em><b>Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUSH__DEVICE = WIDGET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Data Set</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUSH__DATA_SET = WIDGET_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Set On</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUSH__SET_ON = WIDGET_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUSH__ICON = WIDGET_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Background Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUSH__BACKGROUND_ICON = WIDGET_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Cmd</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUSH__CMD = WIDGET_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Double Click</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUSH__DOUBLE_CLICK = WIDGET_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Countdown</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUSH__COUNTDOWN = WIDGET_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUSH__CLASS = WIDGET_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUSH__URL = WIDGET_FEATURE_COUNT + 9;

  /**
   * The number of structural features of the '<em>Push</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int PUSH_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 10;

  /**
   * The meta object id for the '{@link org.ckr.tabletUIDSL.impl.ImageImpl <em>Image</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ckr.tabletUIDSL.impl.ImageImpl
   * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getImage()
   * @generated
   */
  int IMAGE = 17;

  /**
   * The feature id for the '<em><b>Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__DEVICE = WIDGET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Get</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__GET = WIDGET_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__SIZE = WIDGET_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE__CLASS = WIDGET_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Image</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int IMAGE_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link org.ckr.tabletUIDSL.impl.SwitchImpl <em>Switch</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ckr.tabletUIDSL.impl.SwitchImpl
   * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getSwitch()
   * @generated
   */
  int SWITCH = 18;

  /**
   * The feature id for the '<em><b>Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__DEVICE = WIDGET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Get</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__GET = WIDGET_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Get On</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__GET_ON = WIDGET_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Set On</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__SET_ON = WIDGET_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Get Off</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__GET_OFF = WIDGET_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__CLASS = WIDGET_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>On Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__ON_COLOR = WIDGET_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Off Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__OFF_COLOR = WIDGET_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>On Back Ground Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__ON_BACK_GROUND_COLOR = WIDGET_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Background Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__BACKGROUND_ICON = WIDGET_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH__ICON = WIDGET_FEATURE_COUNT + 10;

  /**
   * The number of structural features of the '<em>Switch</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SWITCH_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 11;

  /**
   * The meta object id for the '{@link org.ckr.tabletUIDSL.impl.CustomImpl <em>Custom</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ckr.tabletUIDSL.impl.CustomImpl
   * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getCustom()
   * @generated
   */
  int CUSTOM = 19;

  /**
   * The feature id for the '<em><b>Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM__CODE = WIDGET_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Custom</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CUSTOM_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link org.ckr.tabletUIDSL.impl.DivImpl <em>Div</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ckr.tabletUIDSL.impl.DivImpl
   * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getDiv()
   * @generated
   */
  int DIV = 20;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__CLASS = WIDGET_DEF_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__STYLE = WIDGET_DEF_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__WIDGETS = WIDGET_DEF_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Div</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV_FEATURE_COUNT = WIDGET_DEF_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link org.ckr.tabletUIDSL.impl.itunes_artworkImpl <em>itunes artwork</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ckr.tabletUIDSL.impl.itunes_artworkImpl
   * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getitunes_artwork()
   * @generated
   */
  int ITUNES_ARTWORK = 21;

  /**
   * The feature id for the '<em><b>Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITUNES_ARTWORK__DEVICE = WIDGET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Get</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITUNES_ARTWORK__GET = WIDGET_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Opacity</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITUNES_ARTWORK__OPACITY = WIDGET_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Size</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITUNES_ARTWORK__SIZE = WIDGET_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITUNES_ARTWORK__CLASS = WIDGET_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITUNES_ARTWORK__STYLE = WIDGET_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>itunes artwork</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ITUNES_ARTWORK_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.ckr.tabletUIDSL.impl.WeatherImpl <em>Weather</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ckr.tabletUIDSL.impl.WeatherImpl
   * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getWeather()
   * @generated
   */
  int WEATHER = 22;

  /**
   * The feature id for the '<em><b>Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEATHER__DEVICE = WIDGET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Get</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEATHER__GET = WIDGET_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEATHER__CLASS = WIDGET_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Imageset</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEATHER__IMAGESET = WIDGET_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Image Path</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEATHER__IMAGE_PATH = WIDGET_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Weather</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WEATHER_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link org.ckr.tabletUIDSL.impl.CalviewImpl <em>Calview</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ckr.tabletUIDSL.impl.CalviewImpl
   * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getCalview()
   * @generated
   */
  int CALVIEW = 23;

  /**
   * The feature id for the '<em><b>Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALVIEW__DEVICE = WIDGET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Get</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALVIEW__GET = WIDGET_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALVIEW__MAX = WIDGET_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALVIEW__CLASS = WIDGET_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>All FC</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALVIEW__ALL_FC = WIDGET_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>All TC</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALVIEW__ALL_TC = WIDGET_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Calview</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CALVIEW_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.ckr.tabletUIDSL.impl.PopupImpl <em>Popup</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ckr.tabletUIDSL.impl.PopupImpl
   * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getPopup()
   * @generated
   */
  int POPUP = 24;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POPUP__WIDTH = WIDGET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POPUP__HEIGHT = WIDGET_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Open Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POPUP__OPEN_ICON = WIDGET_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Open Background Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POPUP__OPEN_BACKGROUND_ICON = WIDGET_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Open Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POPUP__OPEN_CLASS = WIDGET_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Dialog Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POPUP__DIALOG_CLASS = WIDGET_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Dialog Header Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POPUP__DIALOG_HEADER_CLASS = WIDGET_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Header</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POPUP__HEADER = WIDGET_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POPUP__WIDGETS = WIDGET_FEATURE_COUNT + 8;

  /**
   * The number of structural features of the '<em>Popup</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int POPUP_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 9;

  /**
   * The meta object id for the '{@link org.ckr.tabletUIDSL.impl.LinkImpl <em>Link</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ckr.tabletUIDSL.impl.LinkImpl
   * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getLink()
   * @generated
   */
  int LINK = 25;

  /**
   * The feature id for the '<em><b>Width</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__WIDTH = WIDGET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Height</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__HEIGHT = WIDGET_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__COLOR = WIDGET_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__CLASS = WIDGET_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Background Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__BACKGROUND_COLOR = WIDGET_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__ICON = WIDGET_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Cmd</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__CMD = WIDGET_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Label</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK__LABEL = WIDGET_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Link</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LINK_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link org.ckr.tabletUIDSL.impl.ButtonUrlImpl <em>Button Url</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ckr.tabletUIDSL.impl.ButtonUrlImpl
   * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getButtonUrl()
   * @generated
   */
  int BUTTON_URL = 26;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_URL__URL = 0;

  /**
   * The feature id for the '<em><b>Page</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_URL__PAGE = 1;

  /**
   * The feature id for the '<em><b>Fhem Cmd</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_URL__FHEM_CMD = 2;

  /**
   * The number of structural features of the '<em>Button Url</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_URL_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link org.ckr.tabletUIDSL.impl.ButtonImpl <em>Button</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ckr.tabletUIDSL.impl.ButtonImpl
   * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getButton()
   * @generated
   */
  int BUTTON = 27;

  /**
   * The feature id for the '<em><b>Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__DEVICE = WIDGET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Get</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__GET = WIDGET_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Get On</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__GET_ON = WIDGET_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Get Warn</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__GET_WARN = WIDGET_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Get Off</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__GET_OFF = WIDGET_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Target</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__TARGET = WIDGET_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__ICON = WIDGET_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Background Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__BACKGROUND_ICON = WIDGET_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__CLASS = WIDGET_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>On Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__ON_COLOR = WIDGET_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>On Background Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__ON_BACKGROUND_COLOR = WIDGET_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Off Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__OFF_COLOR = WIDGET_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Off Background Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__OFF_BACKGROUND_COLOR = WIDGET_FEATURE_COUNT + 12;

  /**
   * The number of structural features of the '<em>Button</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 13;

  /**
   * The meta object id for the '{@link org.ckr.tabletUIDSL.impl.KlimatrendImpl <em>Klimatrend</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ckr.tabletUIDSL.impl.KlimatrendImpl
   * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getKlimatrend()
   * @generated
   */
  int KLIMATREND = 28;

  /**
   * The feature id for the '<em><b>Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KLIMATREND__DEVICE = WIDGET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Get</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KLIMATREND__GET = WIDGET_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KLIMATREND__CLASS = WIDGET_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Refperiod</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KLIMATREND__REFPERIOD = WIDGET_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Stagnating Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KLIMATREND__STAGNATING_COLOR = WIDGET_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KLIMATREND__ICON = WIDGET_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Rising Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KLIMATREND__RISING_COLOR = WIDGET_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Falling Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KLIMATREND__FALLING_COLOR = WIDGET_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Highmark</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KLIMATREND__HIGHMARK = WIDGET_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Highmark Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KLIMATREND__HIGHMARK_ICON = WIDGET_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Highmark Rising Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KLIMATREND__HIGHMARK_RISING_COLOR = WIDGET_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Highmark Falling Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KLIMATREND__HIGHMARK_FALLING_COLOR = WIDGET_FEATURE_COUNT + 11;

  /**
   * The number of structural features of the '<em>Klimatrend</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int KLIMATREND_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 12;

  /**
   * The meta object id for the '{@link org.ckr.tabletUIDSL.impl.SymbolImpl <em>Symbol</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ckr.tabletUIDSL.impl.SymbolImpl
   * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getSymbol()
   * @generated
   */
  int SYMBOL = 29;

  /**
   * The feature id for the '<em><b>Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL__DEVICE = WIDGET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Get</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL__GET = WIDGET_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Get On</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL__GET_ON = WIDGET_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Get Warn</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL__GET_WARN = WIDGET_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Get Off</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL__GET_OFF = WIDGET_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL__CLASS = WIDGET_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Bgicon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL__BGICON = WIDGET_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Off Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL__OFF_COLOR = WIDGET_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Icons</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL__ICONS = WIDGET_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>On Colors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL__ON_COLORS = WIDGET_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>On Background Colors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL__ON_BACKGROUND_COLORS = WIDGET_FEATURE_COUNT + 10;

  /**
   * The number of structural features of the '<em>Symbol</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 11;

  /**
   * The meta object id for the '{@link org.ckr.tabletUIDSL.impl.SimpleClockImpl <em>Simple Clock</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ckr.tabletUIDSL.impl.SimpleClockImpl
   * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getSimpleClock()
   * @generated
   */
  int SIMPLE_CLOCK = 30;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_CLOCK__ID = WIDGET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Date Format</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_CLOCK__DATE_FORMAT = WIDGET_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Time Format</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_CLOCK__TIME_FORMAT = WIDGET_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Date Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_CLOCK__DATE_COLOR = WIDGET_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Time Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_CLOCK__TIME_COLOR = WIDGET_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_CLOCK__CLASS = WIDGET_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_CLOCK__STYLE = WIDGET_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Bg Colors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_CLOCK__BG_COLORS = WIDGET_FEATURE_COUNT + 7;

  /**
   * The number of structural features of the '<em>Simple Clock</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_CLOCK_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 8;

  /**
   * The meta object id for the '{@link org.ckr.tabletUIDSL.impl.SimpleChartImpl <em>Simple Chart</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ckr.tabletUIDSL.impl.SimpleChartImpl
   * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getSimpleChart()
   * @generated
   */
  int SIMPLE_CHART = 31;

  /**
   * The feature id for the '<em><b>Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_CHART__DEVICE = WIDGET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Log device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_CHART__LOG_DEVICE = WIDGET_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Logfile</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_CHART__LOGFILE = WIDGET_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Column Spec</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_CHART__COLUMN_SPEC = WIDGET_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Min</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_CHART__MIN = WIDGET_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Max</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_CHART__MAX = WIDGET_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>XTicks</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_CHART__XTICKS = WIDGET_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>YTicks</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_CHART__YTICKS = WIDGET_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Daysago</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_CHART__DAYSAGO = WIDGET_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_CHART__CLASS = WIDGET_FEATURE_COUNT + 9;

  /**
   * The number of structural features of the '<em>Simple Chart</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SIMPLE_CHART_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 10;

  /**
   * The meta object id for the '{@link org.ckr.tabletUIDSL.impl.ColorImpl <em>Color</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ckr.tabletUIDSL.impl.ColorImpl
   * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getColor()
   * @generated
   */
  int COLOR = 32;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR__NAME = SETTINGS_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Rgb</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR__RGB = SETTINGS_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Color</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int COLOR_FEATURE_COUNT = SETTINGS_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link org.ckr.tabletUIDSL.impl.LabelImpl <em>Label</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ckr.tabletUIDSL.impl.LabelImpl
   * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getLabel()
   * @generated
   */
  int LABEL = 33;

  /**
   * The feature id for the '<em><b>Device</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__DEVICE = WIDGET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Get</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__GET = WIDGET_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__CLASS = WIDGET_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Style</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__STYLE = WIDGET_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Unit</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__UNIT = WIDGET_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Part</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__PART = WIDGET_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Substitution</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__SUBSTITUTION = WIDGET_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 7;


  /**
   * Returns the meta object for class '{@link org.ckr.tabletUIDSL.TabletUI <em>Tablet UI</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Tablet UI</em>'.
   * @see org.ckr.tabletUIDSL.TabletUI
   * @generated
   */
  EClass getTabletUI();

  /**
   * Returns the meta object for the containment reference '{@link org.ckr.tabletUIDSL.TabletUI#getSettings <em>Settings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Settings</em>'.
   * @see org.ckr.tabletUIDSL.TabletUI#getSettings()
   * @see #getTabletUI()
   * @generated
   */
  EReference getTabletUI_Settings();

  /**
   * Returns the meta object for the containment reference list '{@link org.ckr.tabletUIDSL.TabletUI#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.ckr.tabletUIDSL.TabletUI#getElements()
   * @see #getTabletUI()
   * @generated
   */
  EReference getTabletUI_Elements();

  /**
   * Returns the meta object for class '{@link org.ckr.tabletUIDSL.Settings <em>Settings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Settings</em>'.
   * @see org.ckr.tabletUIDSL.Settings
   * @generated
   */
  EClass getSettings();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Settings#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see org.ckr.tabletUIDSL.Settings#getTitle()
   * @see #getSettings()
   * @generated
   */
  EAttribute getSettings_Title();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Settings#getFhemweb_url <em>Fhemweb url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fhemweb url</em>'.
   * @see org.ckr.tabletUIDSL.Settings#getFhemweb_url()
   * @see #getSettings()
   * @generated
   */
  EAttribute getSettings_Fhemweb_url();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Settings#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width</em>'.
   * @see org.ckr.tabletUIDSL.Settings#getWidth()
   * @see #getSettings()
   * @generated
   */
  EAttribute getSettings_Width();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Settings#getHeight <em>Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Height</em>'.
   * @see org.ckr.tabletUIDSL.Settings#getHeight()
   * @see #getSettings()
   * @generated
   */
  EAttribute getSettings_Height();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Settings#getColumns <em>Columns</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Columns</em>'.
   * @see org.ckr.tabletUIDSL.Settings#getColumns()
   * @see #getSettings()
   * @generated
   */
  EAttribute getSettings_Columns();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Settings#getRows <em>Rows</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rows</em>'.
   * @see org.ckr.tabletUIDSL.Settings#getRows()
   * @see #getSettings()
   * @generated
   */
  EAttribute getSettings_Rows();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Settings#getDebug <em>Debug</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Debug</em>'.
   * @see org.ckr.tabletUIDSL.Settings#getDebug()
   * @see #getSettings()
   * @generated
   */
  EAttribute getSettings_Debug();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Settings#getDragdrop <em>Dragdrop</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dragdrop</em>'.
   * @see org.ckr.tabletUIDSL.Settings#getDragdrop()
   * @see #getSettings()
   * @generated
   */
  EAttribute getSettings_Dragdrop();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Settings#getMargin <em>Margin</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Margin</em>'.
   * @see org.ckr.tabletUIDSL.Settings#getMargin()
   * @see #getSettings()
   * @generated
   */
  EAttribute getSettings_Margin();

  /**
   * Returns the meta object for the containment reference list '{@link org.ckr.tabletUIDSL.Settings#getSettings <em>Settings</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Settings</em>'.
   * @see org.ckr.tabletUIDSL.Settings#getSettings()
   * @see #getSettings()
   * @generated
   */
  EReference getSettings_Settings();

  /**
   * Returns the meta object for class '{@link org.ckr.tabletUIDSL.SettingsElement <em>Settings Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Settings Element</em>'.
   * @see org.ckr.tabletUIDSL.SettingsElement
   * @generated
   */
  EClass getSettingsElement();

  /**
   * Returns the meta object for class '{@link org.ckr.tabletUIDSL.CSS <em>CSS</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>CSS</em>'.
   * @see org.ckr.tabletUIDSL.CSS
   * @generated
   */
  EClass getCSS();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.CSS#getPath <em>Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Path</em>'.
   * @see org.ckr.tabletUIDSL.CSS#getPath()
   * @see #getCSS()
   * @generated
   */
  EAttribute getCSS_Path();

  /**
   * Returns the meta object for class '{@link org.ckr.tabletUIDSL.AbstractElement <em>Abstract Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Abstract Element</em>'.
   * @see org.ckr.tabletUIDSL.AbstractElement
   * @generated
   */
  EClass getAbstractElement();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.AbstractElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ckr.tabletUIDSL.AbstractElement#getName()
   * @see #getAbstractElement()
   * @generated
   */
  EAttribute getAbstractElement_Name();

  /**
   * Returns the meta object for class '{@link org.ckr.tabletUIDSL.Page <em>Page</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Page</em>'.
   * @see org.ckr.tabletUIDSL.Page
   * @generated
   */
  EClass getPage();

  /**
   * Returns the meta object for the reference '{@link org.ckr.tabletUIDSL.Page#getScreensaver <em>Screensaver</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Screensaver</em>'.
   * @see org.ckr.tabletUIDSL.Page#getScreensaver()
   * @see #getPage()
   * @generated
   */
  EReference getPage_Screensaver();

  /**
   * Returns the meta object for the containment reference list '{@link org.ckr.tabletUIDSL.Page#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.ckr.tabletUIDSL.Page#getElements()
   * @see #getPage()
   * @generated
   */
  EReference getPage_Elements();

  /**
   * Returns the meta object for class '{@link org.ckr.tabletUIDSL.Screensaver <em>Screensaver</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Screensaver</em>'.
   * @see org.ckr.tabletUIDSL.Screensaver
   * @generated
   */
  EClass getScreensaver();

  /**
   * Returns the meta object for the containment reference list '{@link org.ckr.tabletUIDSL.Screensaver#getWidgets <em>Widgets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Widgets</em>'.
   * @see org.ckr.tabletUIDSL.Screensaver#getWidgets()
   * @see #getScreensaver()
   * @generated
   */
  EReference getScreensaver_Widgets();

  /**
   * Returns the meta object for class '{@link org.ckr.tabletUIDSL.Template <em>Template</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template</em>'.
   * @see org.ckr.tabletUIDSL.Template
   * @generated
   */
  EClass getTemplate();

  /**
   * Returns the meta object for the containment reference list '{@link org.ckr.tabletUIDSL.Template#getElements <em>Elements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Elements</em>'.
   * @see org.ckr.tabletUIDSL.Template#getElements()
   * @see #getTemplate()
   * @generated
   */
  EReference getTemplate_Elements();

  /**
   * Returns the meta object for class '{@link org.ckr.tabletUIDSL.Gridster <em>Gridster</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Gridster</em>'.
   * @see org.ckr.tabletUIDSL.Gridster
   * @generated
   */
  EClass getGridster();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Gridster#getHeader <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Header</em>'.
   * @see org.ckr.tabletUIDSL.Gridster#getHeader()
   * @see #getGridster()
   * @generated
   */
  EAttribute getGridster_Header();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Gridster#getRow <em>Row</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Row</em>'.
   * @see org.ckr.tabletUIDSL.Gridster#getRow()
   * @see #getGridster()
   * @generated
   */
  EAttribute getGridster_Row();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Gridster#getColumn <em>Column</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Column</em>'.
   * @see org.ckr.tabletUIDSL.Gridster#getColumn()
   * @see #getGridster()
   * @generated
   */
  EAttribute getGridster_Column();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Gridster#getColspan <em>Colspan</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Colspan</em>'.
   * @see org.ckr.tabletUIDSL.Gridster#getColspan()
   * @see #getGridster()
   * @generated
   */
  EAttribute getGridster_Colspan();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Gridster#getRowspan <em>Rowspan</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rowspan</em>'.
   * @see org.ckr.tabletUIDSL.Gridster#getRowspan()
   * @see #getGridster()
   * @generated
   */
  EAttribute getGridster_Rowspan();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Gridster#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see org.ckr.tabletUIDSL.Gridster#getClass_()
   * @see #getGridster()
   * @generated
   */
  EAttribute getGridster_Class();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Gridster#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Style</em>'.
   * @see org.ckr.tabletUIDSL.Gridster#getStyle()
   * @see #getGridster()
   * @generated
   */
  EAttribute getGridster_Style();

  /**
   * Returns the meta object for the containment reference list '{@link org.ckr.tabletUIDSL.Gridster#getColors <em>Colors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Colors</em>'.
   * @see org.ckr.tabletUIDSL.Gridster#getColors()
   * @see #getGridster()
   * @generated
   */
  EReference getGridster_Colors();

  /**
   * Returns the meta object for the containment reference list '{@link org.ckr.tabletUIDSL.Gridster#getWidgets <em>Widgets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Widgets</em>'.
   * @see org.ckr.tabletUIDSL.Gridster#getWidgets()
   * @see #getGridster()
   * @generated
   */
  EReference getGridster_Widgets();

  /**
   * Returns the meta object for class '{@link org.ckr.tabletUIDSL.WidgetDef <em>Widget Def</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Widget Def</em>'.
   * @see org.ckr.tabletUIDSL.WidgetDef
   * @generated
   */
  EClass getWidgetDef();

  /**
   * Returns the meta object for class '{@link org.ckr.tabletUIDSL.Widget <em>Widget</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Widget</em>'.
   * @see org.ckr.tabletUIDSL.Widget
   * @generated
   */
  EClass getWidget();

  /**
   * Returns the meta object for class '{@link org.ckr.tabletUIDSL.Clock <em>Clock</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Clock</em>'.
   * @see org.ckr.tabletUIDSL.Clock
   * @generated
   */
  EClass getClock();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Clock#getFormat <em>Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Format</em>'.
   * @see org.ckr.tabletUIDSL.Clock#getFormat()
   * @see #getClock()
   * @generated
   */
  EAttribute getClock_Format();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Clock#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see org.ckr.tabletUIDSL.Clock#getClass_()
   * @see #getClock()
   * @generated
   */
  EAttribute getClock_Class();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Clock#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Style</em>'.
   * @see org.ckr.tabletUIDSL.Clock#getStyle()
   * @see #getClock()
   * @generated
   */
  EAttribute getClock_Style();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Clock#getInterval <em>Interval</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Interval</em>'.
   * @see org.ckr.tabletUIDSL.Clock#getInterval()
   * @see #getClock()
   * @generated
   */
  EAttribute getClock_Interval();

  /**
   * Returns the meta object for the attribute list '{@link org.ckr.tabletUIDSL.Clock#getDays <em>Days</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Days</em>'.
   * @see org.ckr.tabletUIDSL.Clock#getDays()
   * @see #getClock()
   * @generated
   */
  EAttribute getClock_Days();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Clock#getShortdayLength <em>Shortday Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Shortday Length</em>'.
   * @see org.ckr.tabletUIDSL.Clock#getShortdayLength()
   * @see #getClock()
   * @generated
   */
  EAttribute getClock_ShortdayLength();

  /**
   * Returns the meta object for the attribute list '{@link org.ckr.tabletUIDSL.Clock#getMonth <em>Month</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Month</em>'.
   * @see org.ckr.tabletUIDSL.Clock#getMonth()
   * @see #getClock()
   * @generated
   */
  EAttribute getClock_Month();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Clock#getMonthLength <em>Month Length</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Month Length</em>'.
   * @see org.ckr.tabletUIDSL.Clock#getMonthLength()
   * @see #getClock()
   * @generated
   */
  EAttribute getClock_MonthLength();

  /**
   * Returns the meta object for class '{@link org.ckr.tabletUIDSL.Swiper <em>Swiper</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Swiper</em>'.
   * @see org.ckr.tabletUIDSL.Swiper
   * @generated
   */
  EClass getSwiper();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Swiper#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width</em>'.
   * @see org.ckr.tabletUIDSL.Swiper#getWidth()
   * @see #getSwiper()
   * @generated
   */
  EAttribute getSwiper_Width();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Swiper#getHeight <em>Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Height</em>'.
   * @see org.ckr.tabletUIDSL.Swiper#getHeight()
   * @see #getSwiper()
   * @generated
   */
  EAttribute getSwiper_Height();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Swiper#getAutoplay <em>Autoplay</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Autoplay</em>'.
   * @see org.ckr.tabletUIDSL.Swiper#getAutoplay()
   * @see #getSwiper()
   * @generated
   */
  EAttribute getSwiper_Autoplay();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Swiper#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see org.ckr.tabletUIDSL.Swiper#getClass_()
   * @see #getSwiper()
   * @generated
   */
  EAttribute getSwiper_Class();

  /**
   * Returns the meta object for the containment reference list '{@link org.ckr.tabletUIDSL.Swiper#getDivs <em>Divs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Divs</em>'.
   * @see org.ckr.tabletUIDSL.Swiper#getDivs()
   * @see #getSwiper()
   * @generated
   */
  EReference getSwiper_Divs();

  /**
   * Returns the meta object for class '{@link org.ckr.tabletUIDSL.TemplateRef <em>Template Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Template Ref</em>'.
   * @see org.ckr.tabletUIDSL.TemplateRef
   * @generated
   */
  EClass getTemplateRef();

  /**
   * Returns the meta object for the containment reference list '{@link org.ckr.tabletUIDSL.TemplateRef#getTemplate <em>Template</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Template</em>'.
   * @see org.ckr.tabletUIDSL.TemplateRef#getTemplate()
   * @see #getTemplateRef()
   * @generated
   */
  EReference getTemplateRef_Template();

  /**
   * Returns the meta object for class '{@link org.ckr.tabletUIDSL.Select <em>Select</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Select</em>'.
   * @see org.ckr.tabletUIDSL.Select
   * @generated
   */
  EClass getSelect();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Select#getDevice <em>Device</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device</em>'.
   * @see org.ckr.tabletUIDSL.Select#getDevice()
   * @see #getSelect()
   * @generated
   */
  EAttribute getSelect_Device();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Select#getList <em>List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>List</em>'.
   * @see org.ckr.tabletUIDSL.Select#getList()
   * @see #getSelect()
   * @generated
   */
  EAttribute getSelect_List();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Select#getItems <em>Items</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Items</em>'.
   * @see org.ckr.tabletUIDSL.Select#getItems()
   * @see #getSelect()
   * @generated
   */
  EAttribute getSelect_Items();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Select#getAlias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Alias</em>'.
   * @see org.ckr.tabletUIDSL.Select#getAlias()
   * @see #getSelect()
   * @generated
   */
  EAttribute getSelect_Alias();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Select#getCmd <em>Cmd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cmd</em>'.
   * @see org.ckr.tabletUIDSL.Select#getCmd()
   * @see #getSelect()
   * @generated
   */
  EAttribute getSelect_Cmd();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Select#getQuote <em>Quote</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Quote</em>'.
   * @see org.ckr.tabletUIDSL.Select#getQuote()
   * @see #getSelect()
   * @generated
   */
  EAttribute getSelect_Quote();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Select#getGet <em>Get</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Get</em>'.
   * @see org.ckr.tabletUIDSL.Select#getGet()
   * @see #getSelect()
   * @generated
   */
  EAttribute getSelect_Get();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Select#getSet <em>Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Set</em>'.
   * @see org.ckr.tabletUIDSL.Select#getSet()
   * @see #getSelect()
   * @generated
   */
  EAttribute getSelect_Set();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Select#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see org.ckr.tabletUIDSL.Select#getClass_()
   * @see #getSelect()
   * @generated
   */
  EAttribute getSelect_Class();

  /**
   * Returns the meta object for class '{@link org.ckr.tabletUIDSL.Volume <em>Volume</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Volume</em>'.
   * @see org.ckr.tabletUIDSL.Volume
   * @generated
   */
  EClass getVolume();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Volume#getDevice <em>Device</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device</em>'.
   * @see org.ckr.tabletUIDSL.Volume#getDevice()
   * @see #getVolume()
   * @generated
   */
  EAttribute getVolume_Device();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Volume#getGet <em>Get</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Get</em>'.
   * @see org.ckr.tabletUIDSL.Volume#getGet()
   * @see #getVolume()
   * @generated
   */
  EAttribute getVolume_Get();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Volume#getSet <em>Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Set</em>'.
   * @see org.ckr.tabletUIDSL.Volume#getSet()
   * @see #getVolume()
   * @generated
   */
  EAttribute getVolume_Set();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Volume#getCmd <em>Cmd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cmd</em>'.
   * @see org.ckr.tabletUIDSL.Volume#getCmd()
   * @see #getVolume()
   * @generated
   */
  EAttribute getVolume_Cmd();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Volume#getMin <em>Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min</em>'.
   * @see org.ckr.tabletUIDSL.Volume#getMin()
   * @see #getVolume()
   * @generated
   */
  EAttribute getVolume_Min();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Volume#getMax <em>Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max</em>'.
   * @see org.ckr.tabletUIDSL.Volume#getMax()
   * @see #getVolume()
   * @generated
   */
  EAttribute getVolume_Max();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Volume#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see org.ckr.tabletUIDSL.Volume#getClass_()
   * @see #getVolume()
   * @generated
   */
  EAttribute getVolume_Class();

  /**
   * Returns the meta object for class '{@link org.ckr.tabletUIDSL.Push <em>Push</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Push</em>'.
   * @see org.ckr.tabletUIDSL.Push
   * @generated
   */
  EClass getPush();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Push#getDevice <em>Device</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device</em>'.
   * @see org.ckr.tabletUIDSL.Push#getDevice()
   * @see #getPush()
   * @generated
   */
  EAttribute getPush_Device();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Push#getDataSet <em>Data Set</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Data Set</em>'.
   * @see org.ckr.tabletUIDSL.Push#getDataSet()
   * @see #getPush()
   * @generated
   */
  EAttribute getPush_DataSet();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Push#getSetOn <em>Set On</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Set On</em>'.
   * @see org.ckr.tabletUIDSL.Push#getSetOn()
   * @see #getPush()
   * @generated
   */
  EAttribute getPush_SetOn();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Push#getIcon <em>Icon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Icon</em>'.
   * @see org.ckr.tabletUIDSL.Push#getIcon()
   * @see #getPush()
   * @generated
   */
  EAttribute getPush_Icon();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Push#getBackgroundIcon <em>Background Icon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Background Icon</em>'.
   * @see org.ckr.tabletUIDSL.Push#getBackgroundIcon()
   * @see #getPush()
   * @generated
   */
  EAttribute getPush_BackgroundIcon();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Push#getCmd <em>Cmd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cmd</em>'.
   * @see org.ckr.tabletUIDSL.Push#getCmd()
   * @see #getPush()
   * @generated
   */
  EAttribute getPush_Cmd();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Push#getDoubleClick <em>Double Click</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Double Click</em>'.
   * @see org.ckr.tabletUIDSL.Push#getDoubleClick()
   * @see #getPush()
   * @generated
   */
  EAttribute getPush_DoubleClick();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Push#getCountdown <em>Countdown</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Countdown</em>'.
   * @see org.ckr.tabletUIDSL.Push#getCountdown()
   * @see #getPush()
   * @generated
   */
  EAttribute getPush_Countdown();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Push#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see org.ckr.tabletUIDSL.Push#getClass_()
   * @see #getPush()
   * @generated
   */
  EAttribute getPush_Class();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Push#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see org.ckr.tabletUIDSL.Push#getUrl()
   * @see #getPush()
   * @generated
   */
  EAttribute getPush_Url();

  /**
   * Returns the meta object for class '{@link org.ckr.tabletUIDSL.Image <em>Image</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Image</em>'.
   * @see org.ckr.tabletUIDSL.Image
   * @generated
   */
  EClass getImage();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Image#getDevice <em>Device</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device</em>'.
   * @see org.ckr.tabletUIDSL.Image#getDevice()
   * @see #getImage()
   * @generated
   */
  EAttribute getImage_Device();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Image#getGet <em>Get</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Get</em>'.
   * @see org.ckr.tabletUIDSL.Image#getGet()
   * @see #getImage()
   * @generated
   */
  EAttribute getImage_Get();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Image#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see org.ckr.tabletUIDSL.Image#getSize()
   * @see #getImage()
   * @generated
   */
  EAttribute getImage_Size();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Image#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see org.ckr.tabletUIDSL.Image#getClass_()
   * @see #getImage()
   * @generated
   */
  EAttribute getImage_Class();

  /**
   * Returns the meta object for class '{@link org.ckr.tabletUIDSL.Switch <em>Switch</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Switch</em>'.
   * @see org.ckr.tabletUIDSL.Switch
   * @generated
   */
  EClass getSwitch();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Switch#getDevice <em>Device</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device</em>'.
   * @see org.ckr.tabletUIDSL.Switch#getDevice()
   * @see #getSwitch()
   * @generated
   */
  EAttribute getSwitch_Device();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Switch#getGet <em>Get</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Get</em>'.
   * @see org.ckr.tabletUIDSL.Switch#getGet()
   * @see #getSwitch()
   * @generated
   */
  EAttribute getSwitch_Get();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Switch#getGetOn <em>Get On</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Get On</em>'.
   * @see org.ckr.tabletUIDSL.Switch#getGetOn()
   * @see #getSwitch()
   * @generated
   */
  EAttribute getSwitch_GetOn();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Switch#getSetOn <em>Set On</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Set On</em>'.
   * @see org.ckr.tabletUIDSL.Switch#getSetOn()
   * @see #getSwitch()
   * @generated
   */
  EAttribute getSwitch_SetOn();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Switch#getGetOff <em>Get Off</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Get Off</em>'.
   * @see org.ckr.tabletUIDSL.Switch#getGetOff()
   * @see #getSwitch()
   * @generated
   */
  EAttribute getSwitch_GetOff();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Switch#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see org.ckr.tabletUIDSL.Switch#getClass_()
   * @see #getSwitch()
   * @generated
   */
  EAttribute getSwitch_Class();

  /**
   * Returns the meta object for the reference '{@link org.ckr.tabletUIDSL.Switch#getOnColor <em>On Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>On Color</em>'.
   * @see org.ckr.tabletUIDSL.Switch#getOnColor()
   * @see #getSwitch()
   * @generated
   */
  EReference getSwitch_OnColor();

  /**
   * Returns the meta object for the reference '{@link org.ckr.tabletUIDSL.Switch#getOffColor <em>Off Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Off Color</em>'.
   * @see org.ckr.tabletUIDSL.Switch#getOffColor()
   * @see #getSwitch()
   * @generated
   */
  EReference getSwitch_OffColor();

  /**
   * Returns the meta object for the reference '{@link org.ckr.tabletUIDSL.Switch#getOnBackGroundColor <em>On Back Ground Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>On Back Ground Color</em>'.
   * @see org.ckr.tabletUIDSL.Switch#getOnBackGroundColor()
   * @see #getSwitch()
   * @generated
   */
  EReference getSwitch_OnBackGroundColor();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Switch#getBackgroundIcon <em>Background Icon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Background Icon</em>'.
   * @see org.ckr.tabletUIDSL.Switch#getBackgroundIcon()
   * @see #getSwitch()
   * @generated
   */
  EAttribute getSwitch_BackgroundIcon();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Switch#getIcon <em>Icon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Icon</em>'.
   * @see org.ckr.tabletUIDSL.Switch#getIcon()
   * @see #getSwitch()
   * @generated
   */
  EAttribute getSwitch_Icon();

  /**
   * Returns the meta object for class '{@link org.ckr.tabletUIDSL.Custom <em>Custom</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Custom</em>'.
   * @see org.ckr.tabletUIDSL.Custom
   * @generated
   */
  EClass getCustom();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Custom#getCode <em>Code</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Code</em>'.
   * @see org.ckr.tabletUIDSL.Custom#getCode()
   * @see #getCustom()
   * @generated
   */
  EAttribute getCustom_Code();

  /**
   * Returns the meta object for class '{@link org.ckr.tabletUIDSL.Div <em>Div</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Div</em>'.
   * @see org.ckr.tabletUIDSL.Div
   * @generated
   */
  EClass getDiv();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Div#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see org.ckr.tabletUIDSL.Div#getClass_()
   * @see #getDiv()
   * @generated
   */
  EAttribute getDiv_Class();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Div#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Style</em>'.
   * @see org.ckr.tabletUIDSL.Div#getStyle()
   * @see #getDiv()
   * @generated
   */
  EAttribute getDiv_Style();

  /**
   * Returns the meta object for the containment reference list '{@link org.ckr.tabletUIDSL.Div#getWidgets <em>Widgets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Widgets</em>'.
   * @see org.ckr.tabletUIDSL.Div#getWidgets()
   * @see #getDiv()
   * @generated
   */
  EReference getDiv_Widgets();

  /**
   * Returns the meta object for class '{@link org.ckr.tabletUIDSL.itunes_artwork <em>itunes artwork</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>itunes artwork</em>'.
   * @see org.ckr.tabletUIDSL.itunes_artwork
   * @generated
   */
  EClass getitunes_artwork();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.itunes_artwork#getDevice <em>Device</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device</em>'.
   * @see org.ckr.tabletUIDSL.itunes_artwork#getDevice()
   * @see #getitunes_artwork()
   * @generated
   */
  EAttribute getitunes_artwork_Device();

  /**
   * Returns the meta object for the attribute list '{@link org.ckr.tabletUIDSL.itunes_artwork#getGet <em>Get</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Get</em>'.
   * @see org.ckr.tabletUIDSL.itunes_artwork#getGet()
   * @see #getitunes_artwork()
   * @generated
   */
  EAttribute getitunes_artwork_Get();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.itunes_artwork#getOpacity <em>Opacity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Opacity</em>'.
   * @see org.ckr.tabletUIDSL.itunes_artwork#getOpacity()
   * @see #getitunes_artwork()
   * @generated
   */
  EAttribute getitunes_artwork_Opacity();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.itunes_artwork#getSize <em>Size</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Size</em>'.
   * @see org.ckr.tabletUIDSL.itunes_artwork#getSize()
   * @see #getitunes_artwork()
   * @generated
   */
  EAttribute getitunes_artwork_Size();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.itunes_artwork#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see org.ckr.tabletUIDSL.itunes_artwork#getClass_()
   * @see #getitunes_artwork()
   * @generated
   */
  EAttribute getitunes_artwork_Class();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.itunes_artwork#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Style</em>'.
   * @see org.ckr.tabletUIDSL.itunes_artwork#getStyle()
   * @see #getitunes_artwork()
   * @generated
   */
  EAttribute getitunes_artwork_Style();

  /**
   * Returns the meta object for class '{@link org.ckr.tabletUIDSL.Weather <em>Weather</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Weather</em>'.
   * @see org.ckr.tabletUIDSL.Weather
   * @generated
   */
  EClass getWeather();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Weather#getDevice <em>Device</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device</em>'.
   * @see org.ckr.tabletUIDSL.Weather#getDevice()
   * @see #getWeather()
   * @generated
   */
  EAttribute getWeather_Device();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Weather#getGet <em>Get</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Get</em>'.
   * @see org.ckr.tabletUIDSL.Weather#getGet()
   * @see #getWeather()
   * @generated
   */
  EAttribute getWeather_Get();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Weather#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see org.ckr.tabletUIDSL.Weather#getClass_()
   * @see #getWeather()
   * @generated
   */
  EAttribute getWeather_Class();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Weather#getImageset <em>Imageset</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Imageset</em>'.
   * @see org.ckr.tabletUIDSL.Weather#getImageset()
   * @see #getWeather()
   * @generated
   */
  EAttribute getWeather_Imageset();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Weather#getImagePath <em>Image Path</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Image Path</em>'.
   * @see org.ckr.tabletUIDSL.Weather#getImagePath()
   * @see #getWeather()
   * @generated
   */
  EAttribute getWeather_ImagePath();

  /**
   * Returns the meta object for class '{@link org.ckr.tabletUIDSL.Calview <em>Calview</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Calview</em>'.
   * @see org.ckr.tabletUIDSL.Calview
   * @generated
   */
  EClass getCalview();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Calview#getDevice <em>Device</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device</em>'.
   * @see org.ckr.tabletUIDSL.Calview#getDevice()
   * @see #getCalview()
   * @generated
   */
  EAttribute getCalview_Device();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Calview#getGet <em>Get</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Get</em>'.
   * @see org.ckr.tabletUIDSL.Calview#getGet()
   * @see #getCalview()
   * @generated
   */
  EAttribute getCalview_Get();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Calview#getMax <em>Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max</em>'.
   * @see org.ckr.tabletUIDSL.Calview#getMax()
   * @see #getCalview()
   * @generated
   */
  EAttribute getCalview_Max();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Calview#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see org.ckr.tabletUIDSL.Calview#getClass_()
   * @see #getCalview()
   * @generated
   */
  EAttribute getCalview_Class();

  /**
   * Returns the meta object for the reference '{@link org.ckr.tabletUIDSL.Calview#getAllFC <em>All FC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>All FC</em>'.
   * @see org.ckr.tabletUIDSL.Calview#getAllFC()
   * @see #getCalview()
   * @generated
   */
  EReference getCalview_AllFC();

  /**
   * Returns the meta object for the reference '{@link org.ckr.tabletUIDSL.Calview#getAllTC <em>All TC</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>All TC</em>'.
   * @see org.ckr.tabletUIDSL.Calview#getAllTC()
   * @see #getCalview()
   * @generated
   */
  EReference getCalview_AllTC();

  /**
   * Returns the meta object for class '{@link org.ckr.tabletUIDSL.Popup <em>Popup</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Popup</em>'.
   * @see org.ckr.tabletUIDSL.Popup
   * @generated
   */
  EClass getPopup();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Popup#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width</em>'.
   * @see org.ckr.tabletUIDSL.Popup#getWidth()
   * @see #getPopup()
   * @generated
   */
  EAttribute getPopup_Width();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Popup#getHeight <em>Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Height</em>'.
   * @see org.ckr.tabletUIDSL.Popup#getHeight()
   * @see #getPopup()
   * @generated
   */
  EAttribute getPopup_Height();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Popup#getOpenIcon <em>Open Icon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Open Icon</em>'.
   * @see org.ckr.tabletUIDSL.Popup#getOpenIcon()
   * @see #getPopup()
   * @generated
   */
  EAttribute getPopup_OpenIcon();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Popup#getOpenBackgroundIcon <em>Open Background Icon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Open Background Icon</em>'.
   * @see org.ckr.tabletUIDSL.Popup#getOpenBackgroundIcon()
   * @see #getPopup()
   * @generated
   */
  EAttribute getPopup_OpenBackgroundIcon();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Popup#getOpenClass <em>Open Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Open Class</em>'.
   * @see org.ckr.tabletUIDSL.Popup#getOpenClass()
   * @see #getPopup()
   * @generated
   */
  EAttribute getPopup_OpenClass();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Popup#getDialogClass <em>Dialog Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dialog Class</em>'.
   * @see org.ckr.tabletUIDSL.Popup#getDialogClass()
   * @see #getPopup()
   * @generated
   */
  EAttribute getPopup_DialogClass();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Popup#getDialogHeaderClass <em>Dialog Header Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Dialog Header Class</em>'.
   * @see org.ckr.tabletUIDSL.Popup#getDialogHeaderClass()
   * @see #getPopup()
   * @generated
   */
  EAttribute getPopup_DialogHeaderClass();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Popup#getHeader <em>Header</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Header</em>'.
   * @see org.ckr.tabletUIDSL.Popup#getHeader()
   * @see #getPopup()
   * @generated
   */
  EAttribute getPopup_Header();

  /**
   * Returns the meta object for the containment reference list '{@link org.ckr.tabletUIDSL.Popup#getWidgets <em>Widgets</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Widgets</em>'.
   * @see org.ckr.tabletUIDSL.Popup#getWidgets()
   * @see #getPopup()
   * @generated
   */
  EReference getPopup_Widgets();

  /**
   * Returns the meta object for class '{@link org.ckr.tabletUIDSL.Link <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Link</em>'.
   * @see org.ckr.tabletUIDSL.Link
   * @generated
   */
  EClass getLink();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Link#getWidth <em>Width</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Width</em>'.
   * @see org.ckr.tabletUIDSL.Link#getWidth()
   * @see #getLink()
   * @generated
   */
  EAttribute getLink_Width();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Link#getHeight <em>Height</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Height</em>'.
   * @see org.ckr.tabletUIDSL.Link#getHeight()
   * @see #getLink()
   * @generated
   */
  EAttribute getLink_Height();

  /**
   * Returns the meta object for the reference '{@link org.ckr.tabletUIDSL.Link#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Color</em>'.
   * @see org.ckr.tabletUIDSL.Link#getColor()
   * @see #getLink()
   * @generated
   */
  EReference getLink_Color();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Link#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see org.ckr.tabletUIDSL.Link#getClass_()
   * @see #getLink()
   * @generated
   */
  EAttribute getLink_Class();

  /**
   * Returns the meta object for the reference '{@link org.ckr.tabletUIDSL.Link#getBackgroundColor <em>Background Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Background Color</em>'.
   * @see org.ckr.tabletUIDSL.Link#getBackgroundColor()
   * @see #getLink()
   * @generated
   */
  EReference getLink_BackgroundColor();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Link#getIcon <em>Icon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Icon</em>'.
   * @see org.ckr.tabletUIDSL.Link#getIcon()
   * @see #getLink()
   * @generated
   */
  EAttribute getLink_Icon();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Link#getCmd <em>Cmd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Cmd</em>'.
   * @see org.ckr.tabletUIDSL.Link#getCmd()
   * @see #getLink()
   * @generated
   */
  EAttribute getLink_Cmd();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Link#getLabel <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Label</em>'.
   * @see org.ckr.tabletUIDSL.Link#getLabel()
   * @see #getLink()
   * @generated
   */
  EAttribute getLink_Label();

  /**
   * Returns the meta object for class '{@link org.ckr.tabletUIDSL.ButtonUrl <em>Button Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Button Url</em>'.
   * @see org.ckr.tabletUIDSL.ButtonUrl
   * @generated
   */
  EClass getButtonUrl();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.ButtonUrl#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see org.ckr.tabletUIDSL.ButtonUrl#getUrl()
   * @see #getButtonUrl()
   * @generated
   */
  EAttribute getButtonUrl_Url();

  /**
   * Returns the meta object for the reference '{@link org.ckr.tabletUIDSL.ButtonUrl#getPage <em>Page</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Page</em>'.
   * @see org.ckr.tabletUIDSL.ButtonUrl#getPage()
   * @see #getButtonUrl()
   * @generated
   */
  EReference getButtonUrl_Page();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.ButtonUrl#getFhemCmd <em>Fhem Cmd</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fhem Cmd</em>'.
   * @see org.ckr.tabletUIDSL.ButtonUrl#getFhemCmd()
   * @see #getButtonUrl()
   * @generated
   */
  EAttribute getButtonUrl_FhemCmd();

  /**
   * Returns the meta object for class '{@link org.ckr.tabletUIDSL.Button <em>Button</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Button</em>'.
   * @see org.ckr.tabletUIDSL.Button
   * @generated
   */
  EClass getButton();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Button#getDevice <em>Device</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device</em>'.
   * @see org.ckr.tabletUIDSL.Button#getDevice()
   * @see #getButton()
   * @generated
   */
  EAttribute getButton_Device();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Button#getGet <em>Get</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Get</em>'.
   * @see org.ckr.tabletUIDSL.Button#getGet()
   * @see #getButton()
   * @generated
   */
  EAttribute getButton_Get();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Button#getGetOn <em>Get On</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Get On</em>'.
   * @see org.ckr.tabletUIDSL.Button#getGetOn()
   * @see #getButton()
   * @generated
   */
  EAttribute getButton_GetOn();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Button#getGetWarn <em>Get Warn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Get Warn</em>'.
   * @see org.ckr.tabletUIDSL.Button#getGetWarn()
   * @see #getButton()
   * @generated
   */
  EAttribute getButton_GetWarn();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Button#getGetOff <em>Get Off</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Get Off</em>'.
   * @see org.ckr.tabletUIDSL.Button#getGetOff()
   * @see #getButton()
   * @generated
   */
  EAttribute getButton_GetOff();

  /**
   * Returns the meta object for the containment reference '{@link org.ckr.tabletUIDSL.Button#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Target</em>'.
   * @see org.ckr.tabletUIDSL.Button#getTarget()
   * @see #getButton()
   * @generated
   */
  EReference getButton_Target();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Button#getIcon <em>Icon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Icon</em>'.
   * @see org.ckr.tabletUIDSL.Button#getIcon()
   * @see #getButton()
   * @generated
   */
  EAttribute getButton_Icon();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Button#getBackgroundIcon <em>Background Icon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Background Icon</em>'.
   * @see org.ckr.tabletUIDSL.Button#getBackgroundIcon()
   * @see #getButton()
   * @generated
   */
  EAttribute getButton_BackgroundIcon();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Button#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see org.ckr.tabletUIDSL.Button#getClass_()
   * @see #getButton()
   * @generated
   */
  EAttribute getButton_Class();

  /**
   * Returns the meta object for the reference '{@link org.ckr.tabletUIDSL.Button#getOnColor <em>On Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>On Color</em>'.
   * @see org.ckr.tabletUIDSL.Button#getOnColor()
   * @see #getButton()
   * @generated
   */
  EReference getButton_OnColor();

  /**
   * Returns the meta object for the reference '{@link org.ckr.tabletUIDSL.Button#getOnBackgroundColor <em>On Background Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>On Background Color</em>'.
   * @see org.ckr.tabletUIDSL.Button#getOnBackgroundColor()
   * @see #getButton()
   * @generated
   */
  EReference getButton_OnBackgroundColor();

  /**
   * Returns the meta object for the reference '{@link org.ckr.tabletUIDSL.Button#getOffColor <em>Off Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Off Color</em>'.
   * @see org.ckr.tabletUIDSL.Button#getOffColor()
   * @see #getButton()
   * @generated
   */
  EReference getButton_OffColor();

  /**
   * Returns the meta object for the reference '{@link org.ckr.tabletUIDSL.Button#getOffBackgroundColor <em>Off Background Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Off Background Color</em>'.
   * @see org.ckr.tabletUIDSL.Button#getOffBackgroundColor()
   * @see #getButton()
   * @generated
   */
  EReference getButton_OffBackgroundColor();

  /**
   * Returns the meta object for class '{@link org.ckr.tabletUIDSL.Klimatrend <em>Klimatrend</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Klimatrend</em>'.
   * @see org.ckr.tabletUIDSL.Klimatrend
   * @generated
   */
  EClass getKlimatrend();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Klimatrend#getDevice <em>Device</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device</em>'.
   * @see org.ckr.tabletUIDSL.Klimatrend#getDevice()
   * @see #getKlimatrend()
   * @generated
   */
  EAttribute getKlimatrend_Device();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Klimatrend#getGet <em>Get</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Get</em>'.
   * @see org.ckr.tabletUIDSL.Klimatrend#getGet()
   * @see #getKlimatrend()
   * @generated
   */
  EAttribute getKlimatrend_Get();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Klimatrend#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see org.ckr.tabletUIDSL.Klimatrend#getClass_()
   * @see #getKlimatrend()
   * @generated
   */
  EAttribute getKlimatrend_Class();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Klimatrend#getRefperiod <em>Refperiod</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Refperiod</em>'.
   * @see org.ckr.tabletUIDSL.Klimatrend#getRefperiod()
   * @see #getKlimatrend()
   * @generated
   */
  EAttribute getKlimatrend_Refperiod();

  /**
   * Returns the meta object for the reference '{@link org.ckr.tabletUIDSL.Klimatrend#getStagnatingColor <em>Stagnating Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Stagnating Color</em>'.
   * @see org.ckr.tabletUIDSL.Klimatrend#getStagnatingColor()
   * @see #getKlimatrend()
   * @generated
   */
  EReference getKlimatrend_StagnatingColor();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Klimatrend#getIcon <em>Icon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Icon</em>'.
   * @see org.ckr.tabletUIDSL.Klimatrend#getIcon()
   * @see #getKlimatrend()
   * @generated
   */
  EAttribute getKlimatrend_Icon();

  /**
   * Returns the meta object for the reference '{@link org.ckr.tabletUIDSL.Klimatrend#getRisingColor <em>Rising Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Rising Color</em>'.
   * @see org.ckr.tabletUIDSL.Klimatrend#getRisingColor()
   * @see #getKlimatrend()
   * @generated
   */
  EReference getKlimatrend_RisingColor();

  /**
   * Returns the meta object for the reference '{@link org.ckr.tabletUIDSL.Klimatrend#getFallingColor <em>Falling Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Falling Color</em>'.
   * @see org.ckr.tabletUIDSL.Klimatrend#getFallingColor()
   * @see #getKlimatrend()
   * @generated
   */
  EReference getKlimatrend_FallingColor();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Klimatrend#getHighmark <em>Highmark</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Highmark</em>'.
   * @see org.ckr.tabletUIDSL.Klimatrend#getHighmark()
   * @see #getKlimatrend()
   * @generated
   */
  EAttribute getKlimatrend_Highmark();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Klimatrend#getHighmarkIcon <em>Highmark Icon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Highmark Icon</em>'.
   * @see org.ckr.tabletUIDSL.Klimatrend#getHighmarkIcon()
   * @see #getKlimatrend()
   * @generated
   */
  EAttribute getKlimatrend_HighmarkIcon();

  /**
   * Returns the meta object for the reference '{@link org.ckr.tabletUIDSL.Klimatrend#getHighmarkRisingColor <em>Highmark Rising Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Highmark Rising Color</em>'.
   * @see org.ckr.tabletUIDSL.Klimatrend#getHighmarkRisingColor()
   * @see #getKlimatrend()
   * @generated
   */
  EReference getKlimatrend_HighmarkRisingColor();

  /**
   * Returns the meta object for the reference '{@link org.ckr.tabletUIDSL.Klimatrend#getHighmarkFallingColor <em>Highmark Falling Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Highmark Falling Color</em>'.
   * @see org.ckr.tabletUIDSL.Klimatrend#getHighmarkFallingColor()
   * @see #getKlimatrend()
   * @generated
   */
  EReference getKlimatrend_HighmarkFallingColor();

  /**
   * Returns the meta object for class '{@link org.ckr.tabletUIDSL.Symbol <em>Symbol</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Symbol</em>'.
   * @see org.ckr.tabletUIDSL.Symbol
   * @generated
   */
  EClass getSymbol();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Symbol#getDevice <em>Device</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device</em>'.
   * @see org.ckr.tabletUIDSL.Symbol#getDevice()
   * @see #getSymbol()
   * @generated
   */
  EAttribute getSymbol_Device();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Symbol#getGet <em>Get</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Get</em>'.
   * @see org.ckr.tabletUIDSL.Symbol#getGet()
   * @see #getSymbol()
   * @generated
   */
  EAttribute getSymbol_Get();

  /**
   * Returns the meta object for the attribute list '{@link org.ckr.tabletUIDSL.Symbol#getGetOn <em>Get On</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Get On</em>'.
   * @see org.ckr.tabletUIDSL.Symbol#getGetOn()
   * @see #getSymbol()
   * @generated
   */
  EAttribute getSymbol_GetOn();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Symbol#getGetWarn <em>Get Warn</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Get Warn</em>'.
   * @see org.ckr.tabletUIDSL.Symbol#getGetWarn()
   * @see #getSymbol()
   * @generated
   */
  EAttribute getSymbol_GetWarn();

  /**
   * Returns the meta object for the attribute list '{@link org.ckr.tabletUIDSL.Symbol#getGetOff <em>Get Off</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Get Off</em>'.
   * @see org.ckr.tabletUIDSL.Symbol#getGetOff()
   * @see #getSymbol()
   * @generated
   */
  EAttribute getSymbol_GetOff();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Symbol#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see org.ckr.tabletUIDSL.Symbol#getClass_()
   * @see #getSymbol()
   * @generated
   */
  EAttribute getSymbol_Class();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Symbol#getBgicon <em>Bgicon</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Bgicon</em>'.
   * @see org.ckr.tabletUIDSL.Symbol#getBgicon()
   * @see #getSymbol()
   * @generated
   */
  EAttribute getSymbol_Bgicon();

  /**
   * Returns the meta object for the reference '{@link org.ckr.tabletUIDSL.Symbol#getOffColor <em>Off Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Off Color</em>'.
   * @see org.ckr.tabletUIDSL.Symbol#getOffColor()
   * @see #getSymbol()
   * @generated
   */
  EReference getSymbol_OffColor();

  /**
   * Returns the meta object for the attribute list '{@link org.ckr.tabletUIDSL.Symbol#getIcons <em>Icons</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Icons</em>'.
   * @see org.ckr.tabletUIDSL.Symbol#getIcons()
   * @see #getSymbol()
   * @generated
   */
  EAttribute getSymbol_Icons();

  /**
   * Returns the meta object for the reference list '{@link org.ckr.tabletUIDSL.Symbol#getOnColors <em>On Colors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>On Colors</em>'.
   * @see org.ckr.tabletUIDSL.Symbol#getOnColors()
   * @see #getSymbol()
   * @generated
   */
  EReference getSymbol_OnColors();

  /**
   * Returns the meta object for the reference list '{@link org.ckr.tabletUIDSL.Symbol#getOnBackgroundColors <em>On Background Colors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>On Background Colors</em>'.
   * @see org.ckr.tabletUIDSL.Symbol#getOnBackgroundColors()
   * @see #getSymbol()
   * @generated
   */
  EReference getSymbol_OnBackgroundColors();

  /**
   * Returns the meta object for class '{@link org.ckr.tabletUIDSL.SimpleClock <em>Simple Clock</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Clock</em>'.
   * @see org.ckr.tabletUIDSL.SimpleClock
   * @generated
   */
  EClass getSimpleClock();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.SimpleClock#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.ckr.tabletUIDSL.SimpleClock#getId()
   * @see #getSimpleClock()
   * @generated
   */
  EAttribute getSimpleClock_Id();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.SimpleClock#getDateFormat <em>Date Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Date Format</em>'.
   * @see org.ckr.tabletUIDSL.SimpleClock#getDateFormat()
   * @see #getSimpleClock()
   * @generated
   */
  EAttribute getSimpleClock_DateFormat();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.SimpleClock#getTimeFormat <em>Time Format</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Time Format</em>'.
   * @see org.ckr.tabletUIDSL.SimpleClock#getTimeFormat()
   * @see #getSimpleClock()
   * @generated
   */
  EAttribute getSimpleClock_TimeFormat();

  /**
   * Returns the meta object for the reference '{@link org.ckr.tabletUIDSL.SimpleClock#getDateColor <em>Date Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Date Color</em>'.
   * @see org.ckr.tabletUIDSL.SimpleClock#getDateColor()
   * @see #getSimpleClock()
   * @generated
   */
  EReference getSimpleClock_DateColor();

  /**
   * Returns the meta object for the reference '{@link org.ckr.tabletUIDSL.SimpleClock#getTimeColor <em>Time Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Time Color</em>'.
   * @see org.ckr.tabletUIDSL.SimpleClock#getTimeColor()
   * @see #getSimpleClock()
   * @generated
   */
  EReference getSimpleClock_TimeColor();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.SimpleClock#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see org.ckr.tabletUIDSL.SimpleClock#getClass_()
   * @see #getSimpleClock()
   * @generated
   */
  EAttribute getSimpleClock_Class();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.SimpleClock#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Style</em>'.
   * @see org.ckr.tabletUIDSL.SimpleClock#getStyle()
   * @see #getSimpleClock()
   * @generated
   */
  EAttribute getSimpleClock_Style();

  /**
   * Returns the meta object for the reference list '{@link org.ckr.tabletUIDSL.SimpleClock#getBgColors <em>Bg Colors</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Bg Colors</em>'.
   * @see org.ckr.tabletUIDSL.SimpleClock#getBgColors()
   * @see #getSimpleClock()
   * @generated
   */
  EReference getSimpleClock_BgColors();

  /**
   * Returns the meta object for class '{@link org.ckr.tabletUIDSL.SimpleChart <em>Simple Chart</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Simple Chart</em>'.
   * @see org.ckr.tabletUIDSL.SimpleChart
   * @generated
   */
  EClass getSimpleChart();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.SimpleChart#getDevice <em>Device</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device</em>'.
   * @see org.ckr.tabletUIDSL.SimpleChart#getDevice()
   * @see #getSimpleChart()
   * @generated
   */
  EAttribute getSimpleChart_Device();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.SimpleChart#getLog_device <em>Log device</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Log device</em>'.
   * @see org.ckr.tabletUIDSL.SimpleChart#getLog_device()
   * @see #getSimpleChart()
   * @generated
   */
  EAttribute getSimpleChart_Log_device();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.SimpleChart#getLogfile <em>Logfile</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Logfile</em>'.
   * @see org.ckr.tabletUIDSL.SimpleChart#getLogfile()
   * @see #getSimpleChart()
   * @generated
   */
  EAttribute getSimpleChart_Logfile();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.SimpleChart#getColumnSpec <em>Column Spec</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Column Spec</em>'.
   * @see org.ckr.tabletUIDSL.SimpleChart#getColumnSpec()
   * @see #getSimpleChart()
   * @generated
   */
  EAttribute getSimpleChart_ColumnSpec();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.SimpleChart#getMin <em>Min</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Min</em>'.
   * @see org.ckr.tabletUIDSL.SimpleChart#getMin()
   * @see #getSimpleChart()
   * @generated
   */
  EAttribute getSimpleChart_Min();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.SimpleChart#getMax <em>Max</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Max</em>'.
   * @see org.ckr.tabletUIDSL.SimpleChart#getMax()
   * @see #getSimpleChart()
   * @generated
   */
  EAttribute getSimpleChart_Max();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.SimpleChart#getXTicks <em>XTicks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>XTicks</em>'.
   * @see org.ckr.tabletUIDSL.SimpleChart#getXTicks()
   * @see #getSimpleChart()
   * @generated
   */
  EAttribute getSimpleChart_XTicks();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.SimpleChart#getYTicks <em>YTicks</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>YTicks</em>'.
   * @see org.ckr.tabletUIDSL.SimpleChart#getYTicks()
   * @see #getSimpleChart()
   * @generated
   */
  EAttribute getSimpleChart_YTicks();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.SimpleChart#getDaysago <em>Daysago</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Daysago</em>'.
   * @see org.ckr.tabletUIDSL.SimpleChart#getDaysago()
   * @see #getSimpleChart()
   * @generated
   */
  EAttribute getSimpleChart_Daysago();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.SimpleChart#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see org.ckr.tabletUIDSL.SimpleChart#getClass_()
   * @see #getSimpleChart()
   * @generated
   */
  EAttribute getSimpleChart_Class();

  /**
   * Returns the meta object for class '{@link org.ckr.tabletUIDSL.Color <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Color</em>'.
   * @see org.ckr.tabletUIDSL.Color
   * @generated
   */
  EClass getColor();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Color#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ckr.tabletUIDSL.Color#getName()
   * @see #getColor()
   * @generated
   */
  EAttribute getColor_Name();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Color#getRgb <em>Rgb</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rgb</em>'.
   * @see org.ckr.tabletUIDSL.Color#getRgb()
   * @see #getColor()
   * @generated
   */
  EAttribute getColor_Rgb();

  /**
   * Returns the meta object for class '{@link org.ckr.tabletUIDSL.Label <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Label</em>'.
   * @see org.ckr.tabletUIDSL.Label
   * @generated
   */
  EClass getLabel();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Label#getDevice <em>Device</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Device</em>'.
   * @see org.ckr.tabletUIDSL.Label#getDevice()
   * @see #getLabel()
   * @generated
   */
  EAttribute getLabel_Device();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Label#getGet <em>Get</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Get</em>'.
   * @see org.ckr.tabletUIDSL.Label#getGet()
   * @see #getLabel()
   * @generated
   */
  EAttribute getLabel_Get();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Label#getClass_ <em>Class</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Class</em>'.
   * @see org.ckr.tabletUIDSL.Label#getClass_()
   * @see #getLabel()
   * @generated
   */
  EAttribute getLabel_Class();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Label#getStyle <em>Style</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Style</em>'.
   * @see org.ckr.tabletUIDSL.Label#getStyle()
   * @see #getLabel()
   * @generated
   */
  EAttribute getLabel_Style();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Label#getUnit <em>Unit</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unit</em>'.
   * @see org.ckr.tabletUIDSL.Label#getUnit()
   * @see #getLabel()
   * @generated
   */
  EAttribute getLabel_Unit();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Label#getPart <em>Part</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Part</em>'.
   * @see org.ckr.tabletUIDSL.Label#getPart()
   * @see #getLabel()
   * @generated
   */
  EAttribute getLabel_Part();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Label#getSubstitution <em>Substitution</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Substitution</em>'.
   * @see org.ckr.tabletUIDSL.Label#getSubstitution()
   * @see #getLabel()
   * @generated
   */
  EAttribute getLabel_Substitution();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  TabletUIDSLFactory getTabletUIDSLFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link org.ckr.tabletUIDSL.impl.TabletUIImpl <em>Tablet UI</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ckr.tabletUIDSL.impl.TabletUIImpl
     * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getTabletUI()
     * @generated
     */
    EClass TABLET_UI = eINSTANCE.getTabletUI();

    /**
     * The meta object literal for the '<em><b>Settings</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLET_UI__SETTINGS = eINSTANCE.getTabletUI_Settings();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TABLET_UI__ELEMENTS = eINSTANCE.getTabletUI_Elements();

    /**
     * The meta object literal for the '{@link org.ckr.tabletUIDSL.impl.SettingsImpl <em>Settings</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ckr.tabletUIDSL.impl.SettingsImpl
     * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getSettings()
     * @generated
     */
    EClass SETTINGS = eINSTANCE.getSettings();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SETTINGS__TITLE = eINSTANCE.getSettings_Title();

    /**
     * The meta object literal for the '<em><b>Fhemweb url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SETTINGS__FHEMWEB_URL = eINSTANCE.getSettings_Fhemweb_url();

    /**
     * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SETTINGS__WIDTH = eINSTANCE.getSettings_Width();

    /**
     * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SETTINGS__HEIGHT = eINSTANCE.getSettings_Height();

    /**
     * The meta object literal for the '<em><b>Columns</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SETTINGS__COLUMNS = eINSTANCE.getSettings_Columns();

    /**
     * The meta object literal for the '<em><b>Rows</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SETTINGS__ROWS = eINSTANCE.getSettings_Rows();

    /**
     * The meta object literal for the '<em><b>Debug</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SETTINGS__DEBUG = eINSTANCE.getSettings_Debug();

    /**
     * The meta object literal for the '<em><b>Dragdrop</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SETTINGS__DRAGDROP = eINSTANCE.getSettings_Dragdrop();

    /**
     * The meta object literal for the '<em><b>Margin</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SETTINGS__MARGIN = eINSTANCE.getSettings_Margin();

    /**
     * The meta object literal for the '<em><b>Settings</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SETTINGS__SETTINGS = eINSTANCE.getSettings_Settings();

    /**
     * The meta object literal for the '{@link org.ckr.tabletUIDSL.impl.SettingsElementImpl <em>Settings Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ckr.tabletUIDSL.impl.SettingsElementImpl
     * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getSettingsElement()
     * @generated
     */
    EClass SETTINGS_ELEMENT = eINSTANCE.getSettingsElement();

    /**
     * The meta object literal for the '{@link org.ckr.tabletUIDSL.impl.CSSImpl <em>CSS</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ckr.tabletUIDSL.impl.CSSImpl
     * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getCSS()
     * @generated
     */
    EClass CSS = eINSTANCE.getCSS();

    /**
     * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CSS__PATH = eINSTANCE.getCSS_Path();

    /**
     * The meta object literal for the '{@link org.ckr.tabletUIDSL.impl.AbstractElementImpl <em>Abstract Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ckr.tabletUIDSL.impl.AbstractElementImpl
     * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getAbstractElement()
     * @generated
     */
    EClass ABSTRACT_ELEMENT = eINSTANCE.getAbstractElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ABSTRACT_ELEMENT__NAME = eINSTANCE.getAbstractElement_Name();

    /**
     * The meta object literal for the '{@link org.ckr.tabletUIDSL.impl.PageImpl <em>Page</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ckr.tabletUIDSL.impl.PageImpl
     * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getPage()
     * @generated
     */
    EClass PAGE = eINSTANCE.getPage();

    /**
     * The meta object literal for the '<em><b>Screensaver</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAGE__SCREENSAVER = eINSTANCE.getPage_Screensaver();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAGE__ELEMENTS = eINSTANCE.getPage_Elements();

    /**
     * The meta object literal for the '{@link org.ckr.tabletUIDSL.impl.ScreensaverImpl <em>Screensaver</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ckr.tabletUIDSL.impl.ScreensaverImpl
     * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getScreensaver()
     * @generated
     */
    EClass SCREENSAVER = eINSTANCE.getScreensaver();

    /**
     * The meta object literal for the '<em><b>Widgets</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SCREENSAVER__WIDGETS = eINSTANCE.getScreensaver_Widgets();

    /**
     * The meta object literal for the '{@link org.ckr.tabletUIDSL.impl.TemplateImpl <em>Template</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ckr.tabletUIDSL.impl.TemplateImpl
     * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getTemplate()
     * @generated
     */
    EClass TEMPLATE = eINSTANCE.getTemplate();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE__ELEMENTS = eINSTANCE.getTemplate_Elements();

    /**
     * The meta object literal for the '{@link org.ckr.tabletUIDSL.impl.GridsterImpl <em>Gridster</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ckr.tabletUIDSL.impl.GridsterImpl
     * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getGridster()
     * @generated
     */
    EClass GRIDSTER = eINSTANCE.getGridster();

    /**
     * The meta object literal for the '<em><b>Header</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRIDSTER__HEADER = eINSTANCE.getGridster_Header();

    /**
     * The meta object literal for the '<em><b>Row</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRIDSTER__ROW = eINSTANCE.getGridster_Row();

    /**
     * The meta object literal for the '<em><b>Column</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRIDSTER__COLUMN = eINSTANCE.getGridster_Column();

    /**
     * The meta object literal for the '<em><b>Colspan</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRIDSTER__COLSPAN = eINSTANCE.getGridster_Colspan();

    /**
     * The meta object literal for the '<em><b>Rowspan</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRIDSTER__ROWSPAN = eINSTANCE.getGridster_Rowspan();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRIDSTER__CLASS = eINSTANCE.getGridster_Class();

    /**
     * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRIDSTER__STYLE = eINSTANCE.getGridster_Style();

    /**
     * The meta object literal for the '<em><b>Colors</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRIDSTER__COLORS = eINSTANCE.getGridster_Colors();

    /**
     * The meta object literal for the '<em><b>Widgets</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRIDSTER__WIDGETS = eINSTANCE.getGridster_Widgets();

    /**
     * The meta object literal for the '{@link org.ckr.tabletUIDSL.impl.WidgetDefImpl <em>Widget Def</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ckr.tabletUIDSL.impl.WidgetDefImpl
     * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getWidgetDef()
     * @generated
     */
    EClass WIDGET_DEF = eINSTANCE.getWidgetDef();

    /**
     * The meta object literal for the '{@link org.ckr.tabletUIDSL.impl.WidgetImpl <em>Widget</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ckr.tabletUIDSL.impl.WidgetImpl
     * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getWidget()
     * @generated
     */
    EClass WIDGET = eINSTANCE.getWidget();

    /**
     * The meta object literal for the '{@link org.ckr.tabletUIDSL.impl.ClockImpl <em>Clock</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ckr.tabletUIDSL.impl.ClockImpl
     * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getClock()
     * @generated
     */
    EClass CLOCK = eINSTANCE.getClock();

    /**
     * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLOCK__FORMAT = eINSTANCE.getClock_Format();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLOCK__CLASS = eINSTANCE.getClock_Class();

    /**
     * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLOCK__STYLE = eINSTANCE.getClock_Style();

    /**
     * The meta object literal for the '<em><b>Interval</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLOCK__INTERVAL = eINSTANCE.getClock_Interval();

    /**
     * The meta object literal for the '<em><b>Days</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLOCK__DAYS = eINSTANCE.getClock_Days();

    /**
     * The meta object literal for the '<em><b>Shortday Length</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLOCK__SHORTDAY_LENGTH = eINSTANCE.getClock_ShortdayLength();

    /**
     * The meta object literal for the '<em><b>Month</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLOCK__MONTH = eINSTANCE.getClock_Month();

    /**
     * The meta object literal for the '<em><b>Month Length</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CLOCK__MONTH_LENGTH = eINSTANCE.getClock_MonthLength();

    /**
     * The meta object literal for the '{@link org.ckr.tabletUIDSL.impl.SwiperImpl <em>Swiper</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ckr.tabletUIDSL.impl.SwiperImpl
     * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getSwiper()
     * @generated
     */
    EClass SWIPER = eINSTANCE.getSwiper();

    /**
     * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SWIPER__WIDTH = eINSTANCE.getSwiper_Width();

    /**
     * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SWIPER__HEIGHT = eINSTANCE.getSwiper_Height();

    /**
     * The meta object literal for the '<em><b>Autoplay</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SWIPER__AUTOPLAY = eINSTANCE.getSwiper_Autoplay();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SWIPER__CLASS = eINSTANCE.getSwiper_Class();

    /**
     * The meta object literal for the '<em><b>Divs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWIPER__DIVS = eINSTANCE.getSwiper_Divs();

    /**
     * The meta object literal for the '{@link org.ckr.tabletUIDSL.impl.TemplateRefImpl <em>Template Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ckr.tabletUIDSL.impl.TemplateRefImpl
     * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getTemplateRef()
     * @generated
     */
    EClass TEMPLATE_REF = eINSTANCE.getTemplateRef();

    /**
     * The meta object literal for the '<em><b>Template</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference TEMPLATE_REF__TEMPLATE = eINSTANCE.getTemplateRef_Template();

    /**
     * The meta object literal for the '{@link org.ckr.tabletUIDSL.impl.SelectImpl <em>Select</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ckr.tabletUIDSL.impl.SelectImpl
     * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getSelect()
     * @generated
     */
    EClass SELECT = eINSTANCE.getSelect();

    /**
     * The meta object literal for the '<em><b>Device</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECT__DEVICE = eINSTANCE.getSelect_Device();

    /**
     * The meta object literal for the '<em><b>List</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECT__LIST = eINSTANCE.getSelect_List();

    /**
     * The meta object literal for the '<em><b>Items</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECT__ITEMS = eINSTANCE.getSelect_Items();

    /**
     * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECT__ALIAS = eINSTANCE.getSelect_Alias();

    /**
     * The meta object literal for the '<em><b>Cmd</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECT__CMD = eINSTANCE.getSelect_Cmd();

    /**
     * The meta object literal for the '<em><b>Quote</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECT__QUOTE = eINSTANCE.getSelect_Quote();

    /**
     * The meta object literal for the '<em><b>Get</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECT__GET = eINSTANCE.getSelect_Get();

    /**
     * The meta object literal for the '<em><b>Set</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECT__SET = eINSTANCE.getSelect_Set();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SELECT__CLASS = eINSTANCE.getSelect_Class();

    /**
     * The meta object literal for the '{@link org.ckr.tabletUIDSL.impl.VolumeImpl <em>Volume</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ckr.tabletUIDSL.impl.VolumeImpl
     * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getVolume()
     * @generated
     */
    EClass VOLUME = eINSTANCE.getVolume();

    /**
     * The meta object literal for the '<em><b>Device</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VOLUME__DEVICE = eINSTANCE.getVolume_Device();

    /**
     * The meta object literal for the '<em><b>Get</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VOLUME__GET = eINSTANCE.getVolume_Get();

    /**
     * The meta object literal for the '<em><b>Set</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VOLUME__SET = eINSTANCE.getVolume_Set();

    /**
     * The meta object literal for the '<em><b>Cmd</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VOLUME__CMD = eINSTANCE.getVolume_Cmd();

    /**
     * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VOLUME__MIN = eINSTANCE.getVolume_Min();

    /**
     * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VOLUME__MAX = eINSTANCE.getVolume_Max();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VOLUME__CLASS = eINSTANCE.getVolume_Class();

    /**
     * The meta object literal for the '{@link org.ckr.tabletUIDSL.impl.PushImpl <em>Push</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ckr.tabletUIDSL.impl.PushImpl
     * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getPush()
     * @generated
     */
    EClass PUSH = eINSTANCE.getPush();

    /**
     * The meta object literal for the '<em><b>Device</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PUSH__DEVICE = eINSTANCE.getPush_Device();

    /**
     * The meta object literal for the '<em><b>Data Set</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PUSH__DATA_SET = eINSTANCE.getPush_DataSet();

    /**
     * The meta object literal for the '<em><b>Set On</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PUSH__SET_ON = eINSTANCE.getPush_SetOn();

    /**
     * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PUSH__ICON = eINSTANCE.getPush_Icon();

    /**
     * The meta object literal for the '<em><b>Background Icon</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PUSH__BACKGROUND_ICON = eINSTANCE.getPush_BackgroundIcon();

    /**
     * The meta object literal for the '<em><b>Cmd</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PUSH__CMD = eINSTANCE.getPush_Cmd();

    /**
     * The meta object literal for the '<em><b>Double Click</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PUSH__DOUBLE_CLICK = eINSTANCE.getPush_DoubleClick();

    /**
     * The meta object literal for the '<em><b>Countdown</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PUSH__COUNTDOWN = eINSTANCE.getPush_Countdown();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PUSH__CLASS = eINSTANCE.getPush_Class();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PUSH__URL = eINSTANCE.getPush_Url();

    /**
     * The meta object literal for the '{@link org.ckr.tabletUIDSL.impl.ImageImpl <em>Image</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ckr.tabletUIDSL.impl.ImageImpl
     * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getImage()
     * @generated
     */
    EClass IMAGE = eINSTANCE.getImage();

    /**
     * The meta object literal for the '<em><b>Device</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE__DEVICE = eINSTANCE.getImage_Device();

    /**
     * The meta object literal for the '<em><b>Get</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE__GET = eINSTANCE.getImage_Get();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE__SIZE = eINSTANCE.getImage_Size();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute IMAGE__CLASS = eINSTANCE.getImage_Class();

    /**
     * The meta object literal for the '{@link org.ckr.tabletUIDSL.impl.SwitchImpl <em>Switch</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ckr.tabletUIDSL.impl.SwitchImpl
     * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getSwitch()
     * @generated
     */
    EClass SWITCH = eINSTANCE.getSwitch();

    /**
     * The meta object literal for the '<em><b>Device</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SWITCH__DEVICE = eINSTANCE.getSwitch_Device();

    /**
     * The meta object literal for the '<em><b>Get</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SWITCH__GET = eINSTANCE.getSwitch_Get();

    /**
     * The meta object literal for the '<em><b>Get On</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SWITCH__GET_ON = eINSTANCE.getSwitch_GetOn();

    /**
     * The meta object literal for the '<em><b>Set On</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SWITCH__SET_ON = eINSTANCE.getSwitch_SetOn();

    /**
     * The meta object literal for the '<em><b>Get Off</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SWITCH__GET_OFF = eINSTANCE.getSwitch_GetOff();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SWITCH__CLASS = eINSTANCE.getSwitch_Class();

    /**
     * The meta object literal for the '<em><b>On Color</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH__ON_COLOR = eINSTANCE.getSwitch_OnColor();

    /**
     * The meta object literal for the '<em><b>Off Color</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH__OFF_COLOR = eINSTANCE.getSwitch_OffColor();

    /**
     * The meta object literal for the '<em><b>On Back Ground Color</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SWITCH__ON_BACK_GROUND_COLOR = eINSTANCE.getSwitch_OnBackGroundColor();

    /**
     * The meta object literal for the '<em><b>Background Icon</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SWITCH__BACKGROUND_ICON = eINSTANCE.getSwitch_BackgroundIcon();

    /**
     * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SWITCH__ICON = eINSTANCE.getSwitch_Icon();

    /**
     * The meta object literal for the '{@link org.ckr.tabletUIDSL.impl.CustomImpl <em>Custom</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ckr.tabletUIDSL.impl.CustomImpl
     * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getCustom()
     * @generated
     */
    EClass CUSTOM = eINSTANCE.getCustom();

    /**
     * The meta object literal for the '<em><b>Code</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CUSTOM__CODE = eINSTANCE.getCustom_Code();

    /**
     * The meta object literal for the '{@link org.ckr.tabletUIDSL.impl.DivImpl <em>Div</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ckr.tabletUIDSL.impl.DivImpl
     * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getDiv()
     * @generated
     */
    EClass DIV = eINSTANCE.getDiv();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIV__CLASS = eINSTANCE.getDiv_Class();

    /**
     * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIV__STYLE = eINSTANCE.getDiv_Style();

    /**
     * The meta object literal for the '<em><b>Widgets</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIV__WIDGETS = eINSTANCE.getDiv_Widgets();

    /**
     * The meta object literal for the '{@link org.ckr.tabletUIDSL.impl.itunes_artworkImpl <em>itunes artwork</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ckr.tabletUIDSL.impl.itunes_artworkImpl
     * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getitunes_artwork()
     * @generated
     */
    EClass ITUNES_ARTWORK = eINSTANCE.getitunes_artwork();

    /**
     * The meta object literal for the '<em><b>Device</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ITUNES_ARTWORK__DEVICE = eINSTANCE.getitunes_artwork_Device();

    /**
     * The meta object literal for the '<em><b>Get</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ITUNES_ARTWORK__GET = eINSTANCE.getitunes_artwork_Get();

    /**
     * The meta object literal for the '<em><b>Opacity</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ITUNES_ARTWORK__OPACITY = eINSTANCE.getitunes_artwork_Opacity();

    /**
     * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ITUNES_ARTWORK__SIZE = eINSTANCE.getitunes_artwork_Size();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ITUNES_ARTWORK__CLASS = eINSTANCE.getitunes_artwork_Class();

    /**
     * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ITUNES_ARTWORK__STYLE = eINSTANCE.getitunes_artwork_Style();

    /**
     * The meta object literal for the '{@link org.ckr.tabletUIDSL.impl.WeatherImpl <em>Weather</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ckr.tabletUIDSL.impl.WeatherImpl
     * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getWeather()
     * @generated
     */
    EClass WEATHER = eINSTANCE.getWeather();

    /**
     * The meta object literal for the '<em><b>Device</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WEATHER__DEVICE = eINSTANCE.getWeather_Device();

    /**
     * The meta object literal for the '<em><b>Get</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WEATHER__GET = eINSTANCE.getWeather_Get();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WEATHER__CLASS = eINSTANCE.getWeather_Class();

    /**
     * The meta object literal for the '<em><b>Imageset</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WEATHER__IMAGESET = eINSTANCE.getWeather_Imageset();

    /**
     * The meta object literal for the '<em><b>Image Path</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute WEATHER__IMAGE_PATH = eINSTANCE.getWeather_ImagePath();

    /**
     * The meta object literal for the '{@link org.ckr.tabletUIDSL.impl.CalviewImpl <em>Calview</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ckr.tabletUIDSL.impl.CalviewImpl
     * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getCalview()
     * @generated
     */
    EClass CALVIEW = eINSTANCE.getCalview();

    /**
     * The meta object literal for the '<em><b>Device</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CALVIEW__DEVICE = eINSTANCE.getCalview_Device();

    /**
     * The meta object literal for the '<em><b>Get</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CALVIEW__GET = eINSTANCE.getCalview_Get();

    /**
     * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CALVIEW__MAX = eINSTANCE.getCalview_Max();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CALVIEW__CLASS = eINSTANCE.getCalview_Class();

    /**
     * The meta object literal for the '<em><b>All FC</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALVIEW__ALL_FC = eINSTANCE.getCalview_AllFC();

    /**
     * The meta object literal for the '<em><b>All TC</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CALVIEW__ALL_TC = eINSTANCE.getCalview_AllTC();

    /**
     * The meta object literal for the '{@link org.ckr.tabletUIDSL.impl.PopupImpl <em>Popup</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ckr.tabletUIDSL.impl.PopupImpl
     * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getPopup()
     * @generated
     */
    EClass POPUP = eINSTANCE.getPopup();

    /**
     * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POPUP__WIDTH = eINSTANCE.getPopup_Width();

    /**
     * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POPUP__HEIGHT = eINSTANCE.getPopup_Height();

    /**
     * The meta object literal for the '<em><b>Open Icon</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POPUP__OPEN_ICON = eINSTANCE.getPopup_OpenIcon();

    /**
     * The meta object literal for the '<em><b>Open Background Icon</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POPUP__OPEN_BACKGROUND_ICON = eINSTANCE.getPopup_OpenBackgroundIcon();

    /**
     * The meta object literal for the '<em><b>Open Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POPUP__OPEN_CLASS = eINSTANCE.getPopup_OpenClass();

    /**
     * The meta object literal for the '<em><b>Dialog Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POPUP__DIALOG_CLASS = eINSTANCE.getPopup_DialogClass();

    /**
     * The meta object literal for the '<em><b>Dialog Header Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POPUP__DIALOG_HEADER_CLASS = eINSTANCE.getPopup_DialogHeaderClass();

    /**
     * The meta object literal for the '<em><b>Header</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute POPUP__HEADER = eINSTANCE.getPopup_Header();

    /**
     * The meta object literal for the '<em><b>Widgets</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference POPUP__WIDGETS = eINSTANCE.getPopup_Widgets();

    /**
     * The meta object literal for the '{@link org.ckr.tabletUIDSL.impl.LinkImpl <em>Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ckr.tabletUIDSL.impl.LinkImpl
     * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getLink()
     * @generated
     */
    EClass LINK = eINSTANCE.getLink();

    /**
     * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINK__WIDTH = eINSTANCE.getLink_Width();

    /**
     * The meta object literal for the '<em><b>Height</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINK__HEIGHT = eINSTANCE.getLink_Height();

    /**
     * The meta object literal for the '<em><b>Color</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK__COLOR = eINSTANCE.getLink_Color();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINK__CLASS = eINSTANCE.getLink_Class();

    /**
     * The meta object literal for the '<em><b>Background Color</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference LINK__BACKGROUND_COLOR = eINSTANCE.getLink_BackgroundColor();

    /**
     * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINK__ICON = eINSTANCE.getLink_Icon();

    /**
     * The meta object literal for the '<em><b>Cmd</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINK__CMD = eINSTANCE.getLink_Cmd();

    /**
     * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LINK__LABEL = eINSTANCE.getLink_Label();

    /**
     * The meta object literal for the '{@link org.ckr.tabletUIDSL.impl.ButtonUrlImpl <em>Button Url</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ckr.tabletUIDSL.impl.ButtonUrlImpl
     * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getButtonUrl()
     * @generated
     */
    EClass BUTTON_URL = eINSTANCE.getButtonUrl();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUTTON_URL__URL = eINSTANCE.getButtonUrl_Url();

    /**
     * The meta object literal for the '<em><b>Page</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUTTON_URL__PAGE = eINSTANCE.getButtonUrl_Page();

    /**
     * The meta object literal for the '<em><b>Fhem Cmd</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUTTON_URL__FHEM_CMD = eINSTANCE.getButtonUrl_FhemCmd();

    /**
     * The meta object literal for the '{@link org.ckr.tabletUIDSL.impl.ButtonImpl <em>Button</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ckr.tabletUIDSL.impl.ButtonImpl
     * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getButton()
     * @generated
     */
    EClass BUTTON = eINSTANCE.getButton();

    /**
     * The meta object literal for the '<em><b>Device</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUTTON__DEVICE = eINSTANCE.getButton_Device();

    /**
     * The meta object literal for the '<em><b>Get</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUTTON__GET = eINSTANCE.getButton_Get();

    /**
     * The meta object literal for the '<em><b>Get On</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUTTON__GET_ON = eINSTANCE.getButton_GetOn();

    /**
     * The meta object literal for the '<em><b>Get Warn</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUTTON__GET_WARN = eINSTANCE.getButton_GetWarn();

    /**
     * The meta object literal for the '<em><b>Get Off</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUTTON__GET_OFF = eINSTANCE.getButton_GetOff();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUTTON__TARGET = eINSTANCE.getButton_Target();

    /**
     * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUTTON__ICON = eINSTANCE.getButton_Icon();

    /**
     * The meta object literal for the '<em><b>Background Icon</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUTTON__BACKGROUND_ICON = eINSTANCE.getButton_BackgroundIcon();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUTTON__CLASS = eINSTANCE.getButton_Class();

    /**
     * The meta object literal for the '<em><b>On Color</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUTTON__ON_COLOR = eINSTANCE.getButton_OnColor();

    /**
     * The meta object literal for the '<em><b>On Background Color</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUTTON__ON_BACKGROUND_COLOR = eINSTANCE.getButton_OnBackgroundColor();

    /**
     * The meta object literal for the '<em><b>Off Color</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUTTON__OFF_COLOR = eINSTANCE.getButton_OffColor();

    /**
     * The meta object literal for the '<em><b>Off Background Color</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUTTON__OFF_BACKGROUND_COLOR = eINSTANCE.getButton_OffBackgroundColor();

    /**
     * The meta object literal for the '{@link org.ckr.tabletUIDSL.impl.KlimatrendImpl <em>Klimatrend</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ckr.tabletUIDSL.impl.KlimatrendImpl
     * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getKlimatrend()
     * @generated
     */
    EClass KLIMATREND = eINSTANCE.getKlimatrend();

    /**
     * The meta object literal for the '<em><b>Device</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KLIMATREND__DEVICE = eINSTANCE.getKlimatrend_Device();

    /**
     * The meta object literal for the '<em><b>Get</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KLIMATREND__GET = eINSTANCE.getKlimatrend_Get();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KLIMATREND__CLASS = eINSTANCE.getKlimatrend_Class();

    /**
     * The meta object literal for the '<em><b>Refperiod</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KLIMATREND__REFPERIOD = eINSTANCE.getKlimatrend_Refperiod();

    /**
     * The meta object literal for the '<em><b>Stagnating Color</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KLIMATREND__STAGNATING_COLOR = eINSTANCE.getKlimatrend_StagnatingColor();

    /**
     * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KLIMATREND__ICON = eINSTANCE.getKlimatrend_Icon();

    /**
     * The meta object literal for the '<em><b>Rising Color</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KLIMATREND__RISING_COLOR = eINSTANCE.getKlimatrend_RisingColor();

    /**
     * The meta object literal for the '<em><b>Falling Color</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KLIMATREND__FALLING_COLOR = eINSTANCE.getKlimatrend_FallingColor();

    /**
     * The meta object literal for the '<em><b>Highmark</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KLIMATREND__HIGHMARK = eINSTANCE.getKlimatrend_Highmark();

    /**
     * The meta object literal for the '<em><b>Highmark Icon</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute KLIMATREND__HIGHMARK_ICON = eINSTANCE.getKlimatrend_HighmarkIcon();

    /**
     * The meta object literal for the '<em><b>Highmark Rising Color</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KLIMATREND__HIGHMARK_RISING_COLOR = eINSTANCE.getKlimatrend_HighmarkRisingColor();

    /**
     * The meta object literal for the '<em><b>Highmark Falling Color</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference KLIMATREND__HIGHMARK_FALLING_COLOR = eINSTANCE.getKlimatrend_HighmarkFallingColor();

    /**
     * The meta object literal for the '{@link org.ckr.tabletUIDSL.impl.SymbolImpl <em>Symbol</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ckr.tabletUIDSL.impl.SymbolImpl
     * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getSymbol()
     * @generated
     */
    EClass SYMBOL = eINSTANCE.getSymbol();

    /**
     * The meta object literal for the '<em><b>Device</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYMBOL__DEVICE = eINSTANCE.getSymbol_Device();

    /**
     * The meta object literal for the '<em><b>Get</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYMBOL__GET = eINSTANCE.getSymbol_Get();

    /**
     * The meta object literal for the '<em><b>Get On</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYMBOL__GET_ON = eINSTANCE.getSymbol_GetOn();

    /**
     * The meta object literal for the '<em><b>Get Warn</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYMBOL__GET_WARN = eINSTANCE.getSymbol_GetWarn();

    /**
     * The meta object literal for the '<em><b>Get Off</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYMBOL__GET_OFF = eINSTANCE.getSymbol_GetOff();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYMBOL__CLASS = eINSTANCE.getSymbol_Class();

    /**
     * The meta object literal for the '<em><b>Bgicon</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYMBOL__BGICON = eINSTANCE.getSymbol_Bgicon();

    /**
     * The meta object literal for the '<em><b>Off Color</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYMBOL__OFF_COLOR = eINSTANCE.getSymbol_OffColor();

    /**
     * The meta object literal for the '<em><b>Icons</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SYMBOL__ICONS = eINSTANCE.getSymbol_Icons();

    /**
     * The meta object literal for the '<em><b>On Colors</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYMBOL__ON_COLORS = eINSTANCE.getSymbol_OnColors();

    /**
     * The meta object literal for the '<em><b>On Background Colors</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYMBOL__ON_BACKGROUND_COLORS = eINSTANCE.getSymbol_OnBackgroundColors();

    /**
     * The meta object literal for the '{@link org.ckr.tabletUIDSL.impl.SimpleClockImpl <em>Simple Clock</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ckr.tabletUIDSL.impl.SimpleClockImpl
     * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getSimpleClock()
     * @generated
     */
    EClass SIMPLE_CLOCK = eINSTANCE.getSimpleClock();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_CLOCK__ID = eINSTANCE.getSimpleClock_Id();

    /**
     * The meta object literal for the '<em><b>Date Format</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_CLOCK__DATE_FORMAT = eINSTANCE.getSimpleClock_DateFormat();

    /**
     * The meta object literal for the '<em><b>Time Format</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_CLOCK__TIME_FORMAT = eINSTANCE.getSimpleClock_TimeFormat();

    /**
     * The meta object literal for the '<em><b>Date Color</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_CLOCK__DATE_COLOR = eINSTANCE.getSimpleClock_DateColor();

    /**
     * The meta object literal for the '<em><b>Time Color</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_CLOCK__TIME_COLOR = eINSTANCE.getSimpleClock_TimeColor();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_CLOCK__CLASS = eINSTANCE.getSimpleClock_Class();

    /**
     * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_CLOCK__STYLE = eINSTANCE.getSimpleClock_Style();

    /**
     * The meta object literal for the '<em><b>Bg Colors</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SIMPLE_CLOCK__BG_COLORS = eINSTANCE.getSimpleClock_BgColors();

    /**
     * The meta object literal for the '{@link org.ckr.tabletUIDSL.impl.SimpleChartImpl <em>Simple Chart</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ckr.tabletUIDSL.impl.SimpleChartImpl
     * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getSimpleChart()
     * @generated
     */
    EClass SIMPLE_CHART = eINSTANCE.getSimpleChart();

    /**
     * The meta object literal for the '<em><b>Device</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_CHART__DEVICE = eINSTANCE.getSimpleChart_Device();

    /**
     * The meta object literal for the '<em><b>Log device</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_CHART__LOG_DEVICE = eINSTANCE.getSimpleChart_Log_device();

    /**
     * The meta object literal for the '<em><b>Logfile</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_CHART__LOGFILE = eINSTANCE.getSimpleChart_Logfile();

    /**
     * The meta object literal for the '<em><b>Column Spec</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_CHART__COLUMN_SPEC = eINSTANCE.getSimpleChart_ColumnSpec();

    /**
     * The meta object literal for the '<em><b>Min</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_CHART__MIN = eINSTANCE.getSimpleChart_Min();

    /**
     * The meta object literal for the '<em><b>Max</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_CHART__MAX = eINSTANCE.getSimpleChart_Max();

    /**
     * The meta object literal for the '<em><b>XTicks</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_CHART__XTICKS = eINSTANCE.getSimpleChart_XTicks();

    /**
     * The meta object literal for the '<em><b>YTicks</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_CHART__YTICKS = eINSTANCE.getSimpleChart_YTicks();

    /**
     * The meta object literal for the '<em><b>Daysago</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_CHART__DAYSAGO = eINSTANCE.getSimpleChart_Daysago();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute SIMPLE_CHART__CLASS = eINSTANCE.getSimpleChart_Class();

    /**
     * The meta object literal for the '{@link org.ckr.tabletUIDSL.impl.ColorImpl <em>Color</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ckr.tabletUIDSL.impl.ColorImpl
     * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getColor()
     * @generated
     */
    EClass COLOR = eINSTANCE.getColor();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLOR__NAME = eINSTANCE.getColor_Name();

    /**
     * The meta object literal for the '<em><b>Rgb</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute COLOR__RGB = eINSTANCE.getColor_Rgb();

    /**
     * The meta object literal for the '{@link org.ckr.tabletUIDSL.impl.LabelImpl <em>Label</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ckr.tabletUIDSL.impl.LabelImpl
     * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getLabel()
     * @generated
     */
    EClass LABEL = eINSTANCE.getLabel();

    /**
     * The meta object literal for the '<em><b>Device</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL__DEVICE = eINSTANCE.getLabel_Device();

    /**
     * The meta object literal for the '<em><b>Get</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL__GET = eINSTANCE.getLabel_Get();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL__CLASS = eINSTANCE.getLabel_Class();

    /**
     * The meta object literal for the '<em><b>Style</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL__STYLE = eINSTANCE.getLabel_Style();

    /**
     * The meta object literal for the '<em><b>Unit</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL__UNIT = eINSTANCE.getLabel_Unit();

    /**
     * The meta object literal for the '<em><b>Part</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL__PART = eINSTANCE.getLabel_Part();

    /**
     * The meta object literal for the '<em><b>Substitution</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL__SUBSTITUTION = eINSTANCE.getLabel_Substitution();

  }

} //TabletUIDSLPackage
