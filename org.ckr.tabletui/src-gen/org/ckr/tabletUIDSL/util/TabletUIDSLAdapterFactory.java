/**
 */
package org.ckr.tabletUIDSL.util;

import org.ckr.tabletUIDSL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.ckr.tabletUIDSL.TabletUIDSLPackage
 * @generated
 */
public class TabletUIDSLAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static TabletUIDSLPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TabletUIDSLAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = TabletUIDSLPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TabletUIDSLSwitch<Adapter> modelSwitch =
    new TabletUIDSLSwitch<Adapter>()
    {
      @Override
      public Adapter caseTabletUI(TabletUI object)
      {
        return createTabletUIAdapter();
      }
      @Override
      public Adapter caseSettings(Settings object)
      {
        return createSettingsAdapter();
      }
      @Override
      public Adapter caseSettingsElement(SettingsElement object)
      {
        return createSettingsElementAdapter();
      }
      @Override
      public Adapter caseCSS(CSS object)
      {
        return createCSSAdapter();
      }
      @Override
      public Adapter caseAbstractElement(AbstractElement object)
      {
        return createAbstractElementAdapter();
      }
      @Override
      public Adapter casePage(Page object)
      {
        return createPageAdapter();
      }
      @Override
      public Adapter caseScreensaver(Screensaver object)
      {
        return createScreensaverAdapter();
      }
      @Override
      public Adapter caseTemplate(Template object)
      {
        return createTemplateAdapter();
      }
      @Override
      public Adapter caseGridster(Gridster object)
      {
        return createGridsterAdapter();
      }
      @Override
      public Adapter caseWidgetDef(WidgetDef object)
      {
        return createWidgetDefAdapter();
      }
      @Override
      public Adapter caseWidget(Widget object)
      {
        return createWidgetAdapter();
      }
      @Override
      public Adapter caseClock(Clock object)
      {
        return createClockAdapter();
      }
      @Override
      public Adapter caseSwiper(Swiper object)
      {
        return createSwiperAdapter();
      }
      @Override
      public Adapter caseTemplateRef(TemplateRef object)
      {
        return createTemplateRefAdapter();
      }
      @Override
      public Adapter caseSelect(Select object)
      {
        return createSelectAdapter();
      }
      @Override
      public Adapter caseVolume(Volume object)
      {
        return createVolumeAdapter();
      }
      @Override
      public Adapter casePush(Push object)
      {
        return createPushAdapter();
      }
      @Override
      public Adapter caseImage(Image object)
      {
        return createImageAdapter();
      }
      @Override
      public Adapter caseSwitch(Switch object)
      {
        return createSwitchAdapter();
      }
      @Override
      public Adapter caseCustom(Custom object)
      {
        return createCustomAdapter();
      }
      @Override
      public Adapter caseDiv(Div object)
      {
        return createDivAdapter();
      }
      @Override
      public Adapter caseitunes_artwork(itunes_artwork object)
      {
        return createitunes_artworkAdapter();
      }
      @Override
      public Adapter caseWeather(Weather object)
      {
        return createWeatherAdapter();
      }
      @Override
      public Adapter caseCalview(Calview object)
      {
        return createCalviewAdapter();
      }
      @Override
      public Adapter casePopup(Popup object)
      {
        return createPopupAdapter();
      }
      @Override
      public Adapter caseLink(Link object)
      {
        return createLinkAdapter();
      }
      @Override
      public Adapter caseButtonUrl(ButtonUrl object)
      {
        return createButtonUrlAdapter();
      }
      @Override
      public Adapter caseButton(Button object)
      {
        return createButtonAdapter();
      }
      @Override
      public Adapter caseKlimatrend(Klimatrend object)
      {
        return createKlimatrendAdapter();
      }
      @Override
      public Adapter caseSymbol(Symbol object)
      {
        return createSymbolAdapter();
      }
      @Override
      public Adapter caseSimpleClock(SimpleClock object)
      {
        return createSimpleClockAdapter();
      }
      @Override
      public Adapter caseSimpleChart(SimpleChart object)
      {
        return createSimpleChartAdapter();
      }
      @Override
      public Adapter caseColor(Color object)
      {
        return createColorAdapter();
      }
      @Override
      public Adapter caseLabel(Label object)
      {
        return createLabelAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link org.ckr.tabletUIDSL.TabletUI <em>Tablet UI</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ckr.tabletUIDSL.TabletUI
   * @generated
   */
  public Adapter createTabletUIAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ckr.tabletUIDSL.Settings <em>Settings</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ckr.tabletUIDSL.Settings
   * @generated
   */
  public Adapter createSettingsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ckr.tabletUIDSL.SettingsElement <em>Settings Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ckr.tabletUIDSL.SettingsElement
   * @generated
   */
  public Adapter createSettingsElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ckr.tabletUIDSL.CSS <em>CSS</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ckr.tabletUIDSL.CSS
   * @generated
   */
  public Adapter createCSSAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ckr.tabletUIDSL.AbstractElement <em>Abstract Element</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ckr.tabletUIDSL.AbstractElement
   * @generated
   */
  public Adapter createAbstractElementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ckr.tabletUIDSL.Page <em>Page</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ckr.tabletUIDSL.Page
   * @generated
   */
  public Adapter createPageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ckr.tabletUIDSL.Screensaver <em>Screensaver</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ckr.tabletUIDSL.Screensaver
   * @generated
   */
  public Adapter createScreensaverAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ckr.tabletUIDSL.Template <em>Template</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ckr.tabletUIDSL.Template
   * @generated
   */
  public Adapter createTemplateAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ckr.tabletUIDSL.Gridster <em>Gridster</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ckr.tabletUIDSL.Gridster
   * @generated
   */
  public Adapter createGridsterAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ckr.tabletUIDSL.WidgetDef <em>Widget Def</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ckr.tabletUIDSL.WidgetDef
   * @generated
   */
  public Adapter createWidgetDefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ckr.tabletUIDSL.Widget <em>Widget</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ckr.tabletUIDSL.Widget
   * @generated
   */
  public Adapter createWidgetAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ckr.tabletUIDSL.Clock <em>Clock</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ckr.tabletUIDSL.Clock
   * @generated
   */
  public Adapter createClockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ckr.tabletUIDSL.Swiper <em>Swiper</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ckr.tabletUIDSL.Swiper
   * @generated
   */
  public Adapter createSwiperAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ckr.tabletUIDSL.TemplateRef <em>Template Ref</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ckr.tabletUIDSL.TemplateRef
   * @generated
   */
  public Adapter createTemplateRefAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ckr.tabletUIDSL.Select <em>Select</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ckr.tabletUIDSL.Select
   * @generated
   */
  public Adapter createSelectAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ckr.tabletUIDSL.Volume <em>Volume</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ckr.tabletUIDSL.Volume
   * @generated
   */
  public Adapter createVolumeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ckr.tabletUIDSL.Push <em>Push</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ckr.tabletUIDSL.Push
   * @generated
   */
  public Adapter createPushAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ckr.tabletUIDSL.Image <em>Image</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ckr.tabletUIDSL.Image
   * @generated
   */
  public Adapter createImageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ckr.tabletUIDSL.Switch <em>Switch</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ckr.tabletUIDSL.Switch
   * @generated
   */
  public Adapter createSwitchAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ckr.tabletUIDSL.Custom <em>Custom</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ckr.tabletUIDSL.Custom
   * @generated
   */
  public Adapter createCustomAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ckr.tabletUIDSL.Div <em>Div</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ckr.tabletUIDSL.Div
   * @generated
   */
  public Adapter createDivAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ckr.tabletUIDSL.itunes_artwork <em>itunes artwork</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ckr.tabletUIDSL.itunes_artwork
   * @generated
   */
  public Adapter createitunes_artworkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ckr.tabletUIDSL.Weather <em>Weather</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ckr.tabletUIDSL.Weather
   * @generated
   */
  public Adapter createWeatherAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ckr.tabletUIDSL.Calview <em>Calview</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ckr.tabletUIDSL.Calview
   * @generated
   */
  public Adapter createCalviewAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ckr.tabletUIDSL.Popup <em>Popup</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ckr.tabletUIDSL.Popup
   * @generated
   */
  public Adapter createPopupAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ckr.tabletUIDSL.Link <em>Link</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ckr.tabletUIDSL.Link
   * @generated
   */
  public Adapter createLinkAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ckr.tabletUIDSL.ButtonUrl <em>Button Url</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ckr.tabletUIDSL.ButtonUrl
   * @generated
   */
  public Adapter createButtonUrlAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ckr.tabletUIDSL.Button <em>Button</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ckr.tabletUIDSL.Button
   * @generated
   */
  public Adapter createButtonAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ckr.tabletUIDSL.Klimatrend <em>Klimatrend</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ckr.tabletUIDSL.Klimatrend
   * @generated
   */
  public Adapter createKlimatrendAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ckr.tabletUIDSL.Symbol <em>Symbol</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ckr.tabletUIDSL.Symbol
   * @generated
   */
  public Adapter createSymbolAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ckr.tabletUIDSL.SimpleClock <em>Simple Clock</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ckr.tabletUIDSL.SimpleClock
   * @generated
   */
  public Adapter createSimpleClockAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ckr.tabletUIDSL.SimpleChart <em>Simple Chart</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ckr.tabletUIDSL.SimpleChart
   * @generated
   */
  public Adapter createSimpleChartAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ckr.tabletUIDSL.Color <em>Color</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ckr.tabletUIDSL.Color
   * @generated
   */
  public Adapter createColorAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.ckr.tabletUIDSL.Label <em>Label</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.ckr.tabletUIDSL.Label
   * @generated
   */
  public Adapter createLabelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //TabletUIDSLAdapterFactory
