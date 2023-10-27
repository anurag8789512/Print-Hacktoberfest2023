import java.util.*;
public class we {
static class Edge
{
int src;
int dest;

public Edge(int s,int d)
{
this.src=s;
this.dest=d;
}

}
public static void dfs(ArrayList<Edge> graph[],int curr,boolean vis[])
{
  System.out.print(curr+" ");
  vis[curr]=true;
  for(int i=0;i<graph[curr].size();i++)
  {
    Edge e=graph[curr].get(i);
    if(vis[e.dest]==false)
    {
      dfs(graph,e.dest,vis);
    }
  }
}

public static void main(String[]args) throws Exception
{
    int k=0;
    int c=0;
    Scanner sc=new Scanner(System.in);
    int m=sc.nextInt();
    int n=sc.nextInt();
    ArrayList<Edge> graph[]=new ArrayList[m];
    int a,b,ji=0;
    for(int i=0;i<graph.length;i++)
    {
        graph[i]=new ArrayList<Edge>();
    }
    while(ji<n)
    {
        a=sc.nextInt();
        b=sc.nextInt();
        graph[a].add(new Edge(a,b));
        ji++;
    }
    for(int j=0;j<graph.length;j++)
    {
    for(int i=0;i<graph[j].size();i++)
    {
      Edge e=graph[j].get(i);
      c++;
    }
    if(c>1)
    {
        k++;
    }
    c=0;
    }
    boolean vis1[]=new boolean[m];
    dfs(graph,0,vis1);
    sc.close();
}
}
