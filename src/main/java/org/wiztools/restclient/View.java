package org.wiztools.restclient;

/**
 *
 * @author schandran
 */
public interface View {
    public void doStart(RequestBean request);
    public void doResponse(ResponseBean response);
    public void doCancelled();
    public void doEnd();
    public void doError(String error);
}
