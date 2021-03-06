/**
 */
package org.ckr.tabletUIDSL.util;

import org.ckr.tabletUIDSL.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.ckr.tabletUIDSL.TabletUIDSLPackage
 * @generated
 */
public class TabletUIDSLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TabletUIDSLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TabletUIDSLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = TabletUIDSLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case TabletUIDSLPackage.TABLET_UI:
      {
        TabletUI tabletUI = (TabletUI)theEObject;
        T result = caseTabletUI(tabletUI);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TabletUIDSLPackage.SETTINGS:
      {
        Settings settings = (Settings)theEObject;
        T result = caseSettings(settings);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TabletUIDSLPackage.SETTINGS_ELEMENT:
      {
        SettingsElement settingsElement = (SettingsElement)theEObject;
        T result = caseSettingsElement(settingsElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TabletUIDSLPackage.CSS:
      {
        CSS css = (CSS)theEObject;
        T result = caseCSS(css);
        if (result == null) result = caseSettingsElement(css);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TabletUIDSLPackage.ABSTRACT_ELEMENT:
      {
        AbstractElement abstractElement = (AbstractElement)theEObject;
        T result = caseAbstractElement(abstractElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TabletUIDSLPackage.PAGE:
      {
        Page page = (Page)theEObject;
        T result = casePage(page);
        if (result == null) result = caseAbstractElement(page);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TabletUIDSLPackage.SCREENSAVER:
      {
        Screensaver screensaver = (Screensaver)theEObject;
        T result = caseScreensaver(screensaver);
        if (result == null) result = caseAbstractElement(screensaver);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TabletUIDSLPackage.TEMPLATE:
      {
        Template template = (Template)theEObject;
        T result = caseTemplate(template);
        if (result == null) result = caseAbstractElement(template);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TabletUIDSLPackage.GRIDSTER:
      {
        Gridster gridster = (Gridster)theEObject;
        T result = caseGridster(gridster);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TabletUIDSLPackage.WIDGET_DEF:
      {
        WidgetDef widgetDef = (WidgetDef)theEObject;
        T result = caseWidgetDef(widgetDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TabletUIDSLPackage.WIDGET:
      {
        Widget widget = (Widget)theEObject;
        T result = caseWidget(widget);
        if (result == null) result = caseWidgetDef(widget);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TabletUIDSLPackage.CLOCK:
      {
        Clock clock = (Clock)theEObject;
        T result = caseClock(clock);
        if (result == null) result = caseWidget(clock);
        if (result == null) result = caseWidgetDef(clock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TabletUIDSLPackage.SWIPER:
      {
        Swiper swiper = (Swiper)theEObject;
        T result = caseSwiper(swiper);
        if (result == null) result = caseWidget(swiper);
        if (result == null) result = caseWidgetDef(swiper);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TabletUIDSLPackage.TEMPLATE_REF:
      {
        TemplateRef templateRef = (TemplateRef)theEObject;
        T result = caseTemplateRef(templateRef);
        if (result == null) result = caseWidget(templateRef);
        if (result == null) result = caseWidgetDef(templateRef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TabletUIDSLPackage.SELECT:
      {
        Select select = (Select)theEObject;
        T result = caseSelect(select);
        if (result == null) result = caseWidget(select);
        if (result == null) result = caseWidgetDef(select);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TabletUIDSLPackage.VOLUME:
      {
        Volume volume = (Volume)theEObject;
        T result = caseVolume(volume);
        if (result == null) result = caseWidget(volume);
        if (result == null) result = caseWidgetDef(volume);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TabletUIDSLPackage.PUSH:
      {
        Push push = (Push)theEObject;
        T result = casePush(push);
        if (result == null) result = caseWidget(push);
        if (result == null) result = caseWidgetDef(push);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TabletUIDSLPackage.IMAGE:
      {
        Image image = (Image)theEObject;
        T result = caseImage(image);
        if (result == null) result = caseWidget(image);
        if (result == null) result = caseWidgetDef(image);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TabletUIDSLPackage.SWITCH:
      {
        org.ckr.tabletUIDSL.Switch switch_ = (org.ckr.tabletUIDSL.Switch)theEObject;
        T result = caseSwitch(switch_);
        if (result == null) result = caseWidget(switch_);
        if (result == null) result = caseWidgetDef(switch_);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TabletUIDSLPackage.CUSTOM:
      {
        Custom custom = (Custom)theEObject;
        T result = caseCustom(custom);
        if (result == null) result = caseWidget(custom);
        if (result == null) result = caseWidgetDef(custom);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TabletUIDSLPackage.DIV:
      {
        Div div = (Div)theEObject;
        T result = caseDiv(div);
        if (result == null) result = caseWidgetDef(div);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TabletUIDSLPackage.ITUNES_ARTWORK:
      {
        itunes_artwork itunes_artwork = (itunes_artwork)theEObject;
        T result = caseitunes_artwork(itunes_artwork);
        if (result == null) result = caseWidget(itunes_artwork);
        if (result == null) result = caseWidgetDef(itunes_artwork);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TabletUIDSLPackage.WEATHER:
      {
        Weather weather = (Weather)theEObject;
        T result = caseWeather(weather);
        if (result == null) result = caseWidget(weather);
        if (result == null) result = caseWidgetDef(weather);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TabletUIDSLPackage.CALVIEW:
      {
        Calview calview = (Calview)theEObject;
        T result = caseCalview(calview);
        if (result == null) result = caseWidget(calview);
        if (result == null) result = caseWidgetDef(calview);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TabletUIDSLPackage.POPUP:
      {
        Popup popup = (Popup)theEObject;
        T result = casePopup(popup);
        if (result == null) result = caseWidget(popup);
        if (result == null) result = caseWidgetDef(popup);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TabletUIDSLPackage.LINK:
      {
        Link link = (Link)theEObject;
        T result = caseLink(link);
        if (result == null) result = caseWidget(link);
        if (result == null) result = caseWidgetDef(link);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TabletUIDSLPackage.BUTTON_URL:
      {
        ButtonUrl buttonUrl = (ButtonUrl)theEObject;
        T result = caseButtonUrl(buttonUrl);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TabletUIDSLPackage.BUTTON:
      {
        Button button = (Button)theEObject;
        T result = caseButton(button);
        if (result == null) result = caseWidget(button);
        if (result == null) result = caseWidgetDef(button);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TabletUIDSLPackage.KLIMATREND:
      {
        Klimatrend klimatrend = (Klimatrend)theEObject;
        T result = caseKlimatrend(klimatrend);
        if (result == null) result = caseWidget(klimatrend);
        if (result == null) result = caseWidgetDef(klimatrend);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TabletUIDSLPackage.SYMBOL:
      {
        Symbol symbol = (Symbol)theEObject;
        T result = caseSymbol(symbol);
        if (result == null) result = caseWidget(symbol);
        if (result == null) result = caseWidgetDef(symbol);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TabletUIDSLPackage.SIMPLE_CLOCK:
      {
        SimpleClock simpleClock = (SimpleClock)theEObject;
        T result = caseSimpleClock(simpleClock);
        if (result == null) result = caseWidget(simpleClock);
        if (result == null) result = caseWidgetDef(simpleClock);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TabletUIDSLPackage.SIMPLE_CHART:
      {
        SimpleChart simpleChart = (SimpleChart)theEObject;
        T result = caseSimpleChart(simpleChart);
        if (result == null) result = caseWidget(simpleChart);
        if (result == null) result = caseWidgetDef(simpleChart);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TabletUIDSLPackage.COLOR:
      {
        Color color = (Color)theEObject;
        T result = caseColor(color);
        if (result == null) result = caseSettingsElement(color);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case TabletUIDSLPackage.LABEL:
      {
        Label label = (Label)theEObject;
        T result = caseLabel(label);
        if (result == null) result = caseWidget(label);
        if (result == null) result = caseWidgetDef(label);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Tablet UI</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Tablet UI</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTabletUI(TabletUI object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Settings</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Settings</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSettings(Settings object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Settings Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Settings Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSettingsElement(SettingsElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>CSS</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>CSS</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCSS(CSS object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Abstract Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Abstract Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAbstractElement(AbstractElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Page</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Page</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePage(Page object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Screensaver</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Screensaver</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseScreensaver(Screensaver object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Template</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Template</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTemplate(Template object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Gridster</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Gridster</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGridster(Gridster object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Widget Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Widget Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWidgetDef(WidgetDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Widget</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Widget</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWidget(Widget object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Clock</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Clock</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseClock(Clock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Swiper</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Swiper</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSwiper(Swiper object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Template Ref</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Template Ref</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseTemplateRef(TemplateRef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Select</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Select</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSelect(Select object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Volume</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Volume</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVolume(Volume object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Push</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Push</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePush(Push object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Image</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Image</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseImage(Image object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Switch</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Switch</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSwitch(org.ckr.tabletUIDSL.Switch object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Custom</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Custom</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCustom(Custom object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Div</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Div</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseDiv(Div object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>itunes artwork</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>itunes artwork</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseitunes_artwork(itunes_artwork object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Weather</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Weather</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWeather(Weather object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Calview</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Calview</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCalview(Calview object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Popup</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Popup</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T casePopup(Popup object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Link</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Link</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLink(Link object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Button Url</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Button Url</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseButtonUrl(ButtonUrl object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Button</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Button</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseButton(Button object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Klimatrend</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Klimatrend</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseKlimatrend(Klimatrend object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Symbol</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Symbol</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSymbol(Symbol object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Clock</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Clock</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleClock(SimpleClock object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Simple Chart</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Simple Chart</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSimpleChart(SimpleChart object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Color</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Color</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseColor(Color object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Label</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Label</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseLabel(Label object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //TabletUIDSLSwitch
