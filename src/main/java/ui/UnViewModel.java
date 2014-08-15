package ui;

import org.uqbar.commons.utils.Observable;

import domain.UnModel;

@Observable
public class UnViewModel {

  private UnModel unModel;

  public UnViewModel(UnModel unModel) {
    this.unModel = unModel;
  }

}
