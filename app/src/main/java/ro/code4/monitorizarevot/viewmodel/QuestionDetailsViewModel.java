package ro.code4.monitorizarevot.viewmodel;

import javax.inject.Inject;

import ro.code4.monitorizarevot.domain.usecase.UseCaseFactory;
import ro.code4.monitorizarevot.presentation.LoadingMessageFactory;
import ro.code4.monitorizarevot.presentation.MessageFactory;

public class QuestionDetailsViewModel extends BaseViewModel {

    @Inject
    public QuestionDetailsViewModel(UseCaseFactory useCaseFactory, LoadingMessageFactory loadingMessageFactory,
                                    MessageFactory messageFactory) {
        super(useCaseFactory, loadingMessageFactory, messageFactory);
    }
}
