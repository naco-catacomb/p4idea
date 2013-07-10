package net.rvd.perforce;

public class PluginSettings
{
  private String _p4client;
  private String _p4port;
  private String _p4user;

  public String getP4client()
  {
    return _p4client;
  }

  public void setP4client( String p4client )
  {
    _p4client = p4client;
  }

  public String getP4port()
  {
    return _p4port;
  }

  public void setP4port( String p4port )
  {
    _p4port = p4port;
  }

  public String getP4user()
  {
    return _p4user;
  }

  public void setP4user( String p4user )
  {
    _p4user = p4user;
  }

  @Override
  public String toString()
  {
    StringBuilder sb = new StringBuilder();
    sb.append( "PluginSettings{ " );
    sb.append( "p4client=" ).append( _p4client );
    sb.append( ", " );
    sb.append( "p4port=" ).append( _p4port );
    sb.append( ", " );
    sb.append( "p4user=" ).append( _p4user );
    sb.append( " }" );
    return sb.toString();
  }
}
