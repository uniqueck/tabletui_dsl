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
   * The number of structural features of the '<em>Abstract Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ABSTRACT_ELEMENT_FEATURE_COUNT = 0;

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
  int PAGE__NAME = ABSTRACT_ELEMENT_FEATURE_COUNT + 0;

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
   * The meta object id for the '{@link org.ckr.tabletUIDSL.impl.GridsterImpl <em>Gridster</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ckr.tabletUIDSL.impl.GridsterImpl
   * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getGridster()
   * @generated
   */
  int GRIDSTER = 6;

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
   * The feature id for the '<em><b>Colors</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRIDSTER__COLORS = 5;

  /**
   * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRIDSTER__WIDGETS = 6;

  /**
   * The number of structural features of the '<em>Gridster</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRIDSTER_FEATURE_COUNT = 7;

  /**
   * The meta object id for the '{@link org.ckr.tabletUIDSL.impl.WidgetImpl <em>Widget</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ckr.tabletUIDSL.impl.WidgetImpl
   * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getWidget()
   * @generated
   */
  int WIDGET = 7;

  /**
   * The number of structural features of the '<em>Widget</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int WIDGET_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link org.ckr.tabletUIDSL.impl.DivImpl <em>Div</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ckr.tabletUIDSL.impl.DivImpl
   * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getDiv()
   * @generated
   */
  int DIV = 8;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__CLASS = 0;

  /**
   * The feature id for the '<em><b>Widgets</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV__WIDGETS = 1;

  /**
   * The number of structural features of the '<em>Div</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIV_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link org.ckr.tabletUIDSL.impl.CalviewImpl <em>Calview</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ckr.tabletUIDSL.impl.CalviewImpl
   * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getCalview()
   * @generated
   */
  int CALVIEW = 9;

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
   * The meta object id for the '{@link org.ckr.tabletUIDSL.impl.ButtonImpl <em>Button</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ckr.tabletUIDSL.impl.ButtonImpl
   * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getButton()
   * @generated
   */
  int BUTTON = 10;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__ID = WIDGET_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Url</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__URL = WIDGET_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Icon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__ICON = WIDGET_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__CLASS = WIDGET_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__COLOR = WIDGET_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Background Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON__BACKGROUND_COLOR = WIDGET_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Button</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BUTTON_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link org.ckr.tabletUIDSL.impl.SymbolImpl <em>Symbol</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ckr.tabletUIDSL.impl.SymbolImpl
   * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getSymbol()
   * @generated
   */
  int SYMBOL = 11;

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
   * The feature id for the '<em><b>Get Off</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL__GET_OFF = WIDGET_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Class</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL__CLASS = WIDGET_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Bgicon</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL__BGICON = WIDGET_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>On Back Ground Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL__ON_BACK_GROUND_COLOR = WIDGET_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>On Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL__ON_COLOR = WIDGET_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Off Color</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL__OFF_COLOR = WIDGET_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Icons</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL__ICONS = WIDGET_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>On Colors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL__ON_COLORS = WIDGET_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>On Background Colors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL__ON_BACKGROUND_COLORS = WIDGET_FEATURE_COUNT + 11;

  /**
   * The number of structural features of the '<em>Symbol</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int SYMBOL_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 12;

  /**
   * The meta object id for the '{@link org.ckr.tabletUIDSL.impl.SimpleClockImpl <em>Simple Clock</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.ckr.tabletUIDSL.impl.SimpleClockImpl
   * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getSimpleClock()
   * @generated
   */
  int SIMPLE_CLOCK = 12;

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
  int SIMPLE_CHART = 13;

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
  int COLOR = 14;

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
  int LABEL = 15;

  /**
   * The feature id for the '<em><b>Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL__ID = WIDGET_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Label</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int LABEL_FEATURE_COUNT = WIDGET_FEATURE_COUNT + 1;


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
   * Returns the meta object for class '{@link org.ckr.tabletUIDSL.Page <em>Page</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Page</em>'.
   * @see org.ckr.tabletUIDSL.Page
   * @generated
   */
  EClass getPage();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Page#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see org.ckr.tabletUIDSL.Page#getName()
   * @see #getPage()
   * @generated
   */
  EAttribute getPage_Name();

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
   * Returns the meta object for class '{@link org.ckr.tabletUIDSL.Widget <em>Widget</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Widget</em>'.
   * @see org.ckr.tabletUIDSL.Widget
   * @generated
   */
  EClass getWidget();

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
   * Returns the meta object for class '{@link org.ckr.tabletUIDSL.Button <em>Button</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Button</em>'.
   * @see org.ckr.tabletUIDSL.Button
   * @generated
   */
  EClass getButton();

  /**
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Button#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.ckr.tabletUIDSL.Button#getId()
   * @see #getButton()
   * @generated
   */
  EAttribute getButton_Id();

  /**
   * Returns the meta object for the reference '{@link org.ckr.tabletUIDSL.Button#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Url</em>'.
   * @see org.ckr.tabletUIDSL.Button#getUrl()
   * @see #getButton()
   * @generated
   */
  EReference getButton_Url();

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
   * Returns the meta object for the reference '{@link org.ckr.tabletUIDSL.Button#getColor <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Color</em>'.
   * @see org.ckr.tabletUIDSL.Button#getColor()
   * @see #getButton()
   * @generated
   */
  EReference getButton_Color();

  /**
   * Returns the meta object for the reference '{@link org.ckr.tabletUIDSL.Button#getBackgroundColor <em>Background Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Background Color</em>'.
   * @see org.ckr.tabletUIDSL.Button#getBackgroundColor()
   * @see #getButton()
   * @generated
   */
  EReference getButton_BackgroundColor();

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
   * Returns the meta object for the reference '{@link org.ckr.tabletUIDSL.Symbol#getOnBackGroundColor <em>On Back Ground Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>On Back Ground Color</em>'.
   * @see org.ckr.tabletUIDSL.Symbol#getOnBackGroundColor()
   * @see #getSymbol()
   * @generated
   */
  EReference getSymbol_OnBackGroundColor();

  /**
   * Returns the meta object for the reference '{@link org.ckr.tabletUIDSL.Symbol#getOnColor <em>On Color</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>On Color</em>'.
   * @see org.ckr.tabletUIDSL.Symbol#getOnColor()
   * @see #getSymbol()
   * @generated
   */
  EReference getSymbol_OnColor();

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
   * Returns the meta object for the attribute '{@link org.ckr.tabletUIDSL.Label#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Id</em>'.
   * @see org.ckr.tabletUIDSL.Label#getId()
   * @see #getLabel()
   * @generated
   */
  EAttribute getLabel_Id();

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
     * The meta object literal for the '{@link org.ckr.tabletUIDSL.impl.PageImpl <em>Page</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ckr.tabletUIDSL.impl.PageImpl
     * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getPage()
     * @generated
     */
    EClass PAGE = eINSTANCE.getPage();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute PAGE__NAME = eINSTANCE.getPage_Name();

    /**
     * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference PAGE__ELEMENTS = eINSTANCE.getPage_Elements();

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
     * The meta object literal for the '{@link org.ckr.tabletUIDSL.impl.WidgetImpl <em>Widget</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ckr.tabletUIDSL.impl.WidgetImpl
     * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getWidget()
     * @generated
     */
    EClass WIDGET = eINSTANCE.getWidget();

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
     * The meta object literal for the '<em><b>Widgets</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIV__WIDGETS = eINSTANCE.getDiv_Widgets();

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
     * The meta object literal for the '{@link org.ckr.tabletUIDSL.impl.ButtonImpl <em>Button</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.ckr.tabletUIDSL.impl.ButtonImpl
     * @see org.ckr.tabletUIDSL.impl.TabletUIDSLPackageImpl#getButton()
     * @generated
     */
    EClass BUTTON = eINSTANCE.getButton();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUTTON__ID = eINSTANCE.getButton_Id();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUTTON__URL = eINSTANCE.getButton_Url();

    /**
     * The meta object literal for the '<em><b>Icon</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUTTON__ICON = eINSTANCE.getButton_Icon();

    /**
     * The meta object literal for the '<em><b>Class</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BUTTON__CLASS = eINSTANCE.getButton_Class();

    /**
     * The meta object literal for the '<em><b>Color</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUTTON__COLOR = eINSTANCE.getButton_Color();

    /**
     * The meta object literal for the '<em><b>Background Color</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BUTTON__BACKGROUND_COLOR = eINSTANCE.getButton_BackgroundColor();

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
     * The meta object literal for the '<em><b>On Back Ground Color</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYMBOL__ON_BACK_GROUND_COLOR = eINSTANCE.getSymbol_OnBackGroundColor();

    /**
     * The meta object literal for the '<em><b>On Color</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference SYMBOL__ON_COLOR = eINSTANCE.getSymbol_OnColor();

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
     * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute LABEL__ID = eINSTANCE.getLabel_Id();

  }

} //TabletUIDSLPackage
