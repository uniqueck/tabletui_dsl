/**
 */
package org.ckr.tabletUIDSL.impl;

import org.ckr.tabletUIDSL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TabletUIDSLFactoryImpl extends EFactoryImpl implements TabletUIDSLFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static TabletUIDSLFactory init()
  {
    try
    {
      TabletUIDSLFactory theTabletUIDSLFactory = (TabletUIDSLFactory)EPackage.Registry.INSTANCE.getEFactory(TabletUIDSLPackage.eNS_URI);
      if (theTabletUIDSLFactory != null)
      {
        return theTabletUIDSLFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new TabletUIDSLFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TabletUIDSLFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case TabletUIDSLPackage.TABLET_UI: return createTabletUI();
      case TabletUIDSLPackage.SETTINGS: return createSettings();
      case TabletUIDSLPackage.SETTINGS_ELEMENT: return createSettingsElement();
      case TabletUIDSLPackage.CSS: return createCSS();
      case TabletUIDSLPackage.ABSTRACT_ELEMENT: return createAbstractElement();
      case TabletUIDSLPackage.PAGE: return createPage();
      case TabletUIDSLPackage.SCREENSAVER: return createScreensaver();
      case TabletUIDSLPackage.TEMPLATE: return createTemplate();
      case TabletUIDSLPackage.GRIDSTER: return createGridster();
      case TabletUIDSLPackage.WIDGET_DEF: return createWidgetDef();
      case TabletUIDSLPackage.WIDGET: return createWidget();
      case TabletUIDSLPackage.CLOCK: return createClock();
      case TabletUIDSLPackage.SWIPER: return createSwiper();
      case TabletUIDSLPackage.TEMPLATE_REF: return createTemplateRef();
      case TabletUIDSLPackage.SELECT: return createSelect();
      case TabletUIDSLPackage.VOLUME: return createVolume();
      case TabletUIDSLPackage.PUSH: return createPush();
      case TabletUIDSLPackage.IMAGE: return createImage();
      case TabletUIDSLPackage.SWITCH: return createSwitch();
      case TabletUIDSLPackage.CUSTOM: return createCustom();
      case TabletUIDSLPackage.DIV: return createDiv();
      case TabletUIDSLPackage.ITUNES_ARTWORK: return createitunes_artwork();
      case TabletUIDSLPackage.WEATHER: return createWeather();
      case TabletUIDSLPackage.CALVIEW: return createCalview();
      case TabletUIDSLPackage.POPUP: return createPopup();
      case TabletUIDSLPackage.LINK: return createLink();
      case TabletUIDSLPackage.BUTTON_URL: return createButtonUrl();
      case TabletUIDSLPackage.BUTTON: return createButton();
      case TabletUIDSLPackage.KLIMATREND: return createKlimatrend();
      case TabletUIDSLPackage.SYMBOL: return createSymbol();
      case TabletUIDSLPackage.SIMPLE_CLOCK: return createSimpleClock();
      case TabletUIDSLPackage.SIMPLE_CHART: return createSimpleChart();
      case TabletUIDSLPackage.COLOR: return createColor();
      case TabletUIDSLPackage.LABEL: return createLabel();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TabletUI createTabletUI()
  {
    TabletUIImpl tabletUI = new TabletUIImpl();
    return tabletUI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Settings createSettings()
  {
    SettingsImpl settings = new SettingsImpl();
    return settings;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SettingsElement createSettingsElement()
  {
    SettingsElementImpl settingsElement = new SettingsElementImpl();
    return settingsElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public CSS createCSS()
  {
    CSSImpl css = new CSSImpl();
    return css;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AbstractElement createAbstractElement()
  {
    AbstractElementImpl abstractElement = new AbstractElementImpl();
    return abstractElement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Page createPage()
  {
    PageImpl page = new PageImpl();
    return page;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Screensaver createScreensaver()
  {
    ScreensaverImpl screensaver = new ScreensaverImpl();
    return screensaver;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Template createTemplate()
  {
    TemplateImpl template = new TemplateImpl();
    return template;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Gridster createGridster()
  {
    GridsterImpl gridster = new GridsterImpl();
    return gridster;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public WidgetDef createWidgetDef()
  {
    WidgetDefImpl widgetDef = new WidgetDefImpl();
    return widgetDef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Widget createWidget()
  {
    WidgetImpl widget = new WidgetImpl();
    return widget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Clock createClock()
  {
    ClockImpl clock = new ClockImpl();
    return clock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Swiper createSwiper()
  {
    SwiperImpl swiper = new SwiperImpl();
    return swiper;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TemplateRef createTemplateRef()
  {
    TemplateRefImpl templateRef = new TemplateRefImpl();
    return templateRef;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Select createSelect()
  {
    SelectImpl select = new SelectImpl();
    return select;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Volume createVolume()
  {
    VolumeImpl volume = new VolumeImpl();
    return volume;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Push createPush()
  {
    PushImpl push = new PushImpl();
    return push;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Image createImage()
  {
    ImageImpl image = new ImageImpl();
    return image;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Switch createSwitch()
  {
    SwitchImpl switch_ = new SwitchImpl();
    return switch_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Custom createCustom()
  {
    CustomImpl custom = new CustomImpl();
    return custom;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Div createDiv()
  {
    DivImpl div = new DivImpl();
    return div;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public itunes_artwork createitunes_artwork()
  {
    itunes_artworkImpl itunes_artwork = new itunes_artworkImpl();
    return itunes_artwork;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Weather createWeather()
  {
    WeatherImpl weather = new WeatherImpl();
    return weather;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Calview createCalview()
  {
    CalviewImpl calview = new CalviewImpl();
    return calview;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Popup createPopup()
  {
    PopupImpl popup = new PopupImpl();
    return popup;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Link createLink()
  {
    LinkImpl link = new LinkImpl();
    return link;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ButtonUrl createButtonUrl()
  {
    ButtonUrlImpl buttonUrl = new ButtonUrlImpl();
    return buttonUrl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Button createButton()
  {
    ButtonImpl button = new ButtonImpl();
    return button;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Klimatrend createKlimatrend()
  {
    KlimatrendImpl klimatrend = new KlimatrendImpl();
    return klimatrend;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Symbol createSymbol()
  {
    SymbolImpl symbol = new SymbolImpl();
    return symbol;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleClock createSimpleClock()
  {
    SimpleClockImpl simpleClock = new SimpleClockImpl();
    return simpleClock;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SimpleChart createSimpleChart()
  {
    SimpleChartImpl simpleChart = new SimpleChartImpl();
    return simpleChart;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color createColor()
  {
    ColorImpl color = new ColorImpl();
    return color;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Label createLabel()
  {
    LabelImpl label = new LabelImpl();
    return label;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TabletUIDSLPackage getTabletUIDSLPackage()
  {
    return (TabletUIDSLPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static TabletUIDSLPackage getPackage()
  {
    return TabletUIDSLPackage.eINSTANCE;
  }

} //TabletUIDSLFactoryImpl
